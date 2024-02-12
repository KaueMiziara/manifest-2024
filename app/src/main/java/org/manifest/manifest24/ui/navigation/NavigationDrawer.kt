package org.manifest.manifest24.ui.navigation

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import org.manifest.manifest24.ui.components.ManifestAppBar
import org.manifest.manifest24.ui.pages.HomePage

@Composable
fun NavigationDrawer() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerContent = {
            NavigationDrawerSheet(scope = scope, drawerState = drawerState)
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
