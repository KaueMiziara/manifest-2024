package org.manifest.manifest24.ui.navigation

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.manifest.manifest24.ui.pages.HomePage

@Composable
fun NavigationDrawer() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                NavigationDrawerItem(
                    label = {
                        Text(text = "1")
                    },
                    selected = true,
                    onClick = {
                        scope.launch {
                            drawerState.close()
                        }
                    },
                )
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
