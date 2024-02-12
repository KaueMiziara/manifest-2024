package org.manifest.manifest24.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import kotlinx.coroutines.launch
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.manifest.manifest24.ui.pages.HomePage

@Composable
fun NavigationDrawer() {
    val drawerItems = listOf(
        NavigationItem("Home", Icons.Default.Home),
        NavigationItem("Placeholder1", Icons.Default.Warning),
        NavigationItem("Placeholder2", Icons.Default.Warning),
    )

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    var selectedItem by remember {
        mutableStateOf(drawerItems[0])
    }

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                drawerItems.forEach {
                    NavigationDrawerItem(
                        label = { Text(it.title) },
                        selected = it == selectedItem,
                        icon = {
                            Icon(imageVector = it.icon, contentDescription = it.title)
                        },
                        onClick = {
                            scope.launch {
                                selectedItem = it
                                drawerState.close()
                            }
                        },
                    )
                }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            topBar = { ManifestAppBar(scope = scope, drawerState = drawerState) }
        ) { innerPadding ->
            HomePage(innerPadding)
        }
    }
}
