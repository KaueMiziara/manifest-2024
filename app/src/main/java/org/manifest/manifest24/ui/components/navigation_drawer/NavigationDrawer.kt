package org.manifest.manifest24.ui.components.navigation_drawer

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.manifest.manifest24.ui.navigation.NavRoute
import org.manifest.manifest24.ui.pages.HomePage
import org.manifest.manifest24.ui.pages.PlaceholderPage

@Composable
fun NavigationDrawer(
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
) {
    val navController = rememberNavController()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            NavigationDrawerSheet(drawerState = drawerState, navController = navController)
        },
    ) {
        NavHost(navController = navController, startDestination = NavRoute.Home.route) {
            composable(NavRoute.Home.route) {
                HomePage(drawerState = drawerState)
            }
            composable(NavRoute.Placeholder.route) {
                PlaceholderPage(drawerState = drawerState, n = "A")
            }
        }
    }
}
