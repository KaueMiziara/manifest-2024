package org.manifest.manifest24.ui.components.navigation_drawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.manifest.manifest24.ui.navigation.NavRoute
import org.manifest.manifest24.ui.navigation.NavigationItem
import org.manifest.manifest24.ui.pages.HomePage
import org.manifest.manifest24.ui.pages.MapPage
import org.manifest.manifest24.ui.pages.PlaceholderPage

@Composable
fun NavigationDrawer(
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
    navController: NavHostController = rememberNavController()
) {
    val items = listOf(
        NavigationItem("Home", NavRoute.Home.route, Icons.Default.Home),
        NavigationItem("Map", NavRoute.Map.route, Icons.Default.LocationOn),
        NavigationItem("Placeholder", NavRoute.Placeholder.route, Icons.Default.Warning),
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            NavigationDrawerSheet(
                drawerState = drawerState,
                navController = navController,
                navItems = items,
            )
        },
    ) {
        NavHost(navController = navController, startDestination = NavRoute.Home.route) {
            composable(NavRoute.Home.route) {
                HomePage(drawerState = drawerState)
            }
            composable(NavRoute.Map.route) {
                MapPage(drawerState = drawerState)
            }
            composable(NavRoute.Placeholder.route) {
                PlaceholderPage(drawerState = drawerState, n = "A")
            }
        }
    }
}
