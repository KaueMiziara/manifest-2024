package org.manifest.manifest24.ui.components.navigation_drawer

import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.manifest.manifest24.ui.navigation.NavigationItem

@Composable
fun NavigationDrawerSheet(
    scope: CoroutineScope = rememberCoroutineScope(),
    drawerState: DrawerState,
    navController: NavController,
    navItems: List<NavigationItem>,
) {
    var selectedItemIndex by rememberSaveable {
        mutableIntStateOf(0)
    }

    ModalDrawerSheet {
        navItems.forEachIndexed { index, item ->
            NavigationDrawerItem(
                label = { Text(item.title) },
                selected = index == selectedItemIndex,
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.title)
                },
                onClick = {
                    selectedItemIndex = index
                    scope.launch {
                        navController.navigate(item.route)
                        drawerState.close()
                    }
                },
            )
        }
    }
}
