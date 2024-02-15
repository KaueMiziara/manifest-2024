package org.manifest.manifest24.ui.components.navigation_drawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.manifest.manifest24.ui.navigation.NavRoute
import org.manifest.manifest24.ui.navigation.NavigationItem
import org.manifest.manifest24.ui.pages.HomePage
import org.manifest.manifest24.ui.pages.ReviewPage

@Composable
fun NavigationDrawer(
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed),
    navController: NavHostController = rememberNavController()
) {
    val items = listOf(
        NavigationItem("Home", NavRoute.Home.route, Icons.Default.Home),
        NavigationItem("Map", NavRoute.Map.route, Icons.Default.LocationOn),
    )

    ModalNavigationDrawer(
        gesturesEnabled = false,
        drawerState = drawerState,
        drawerContent = {
            NavigationDrawerSheet(
                drawerState = drawerState,
                navItems = items,
                onNavigationItemClick = {
                    navController.navigate(it.route)
                }
            )
        },
    ) {
        NavHost(navController = navController, startDestination = NavRoute.Home.route) {
            homePage(drawerState)
            reviewPage(drawerState)
        }
    }
}

private fun NavGraphBuilder.homePage(drawerState: DrawerState) {
    composable(NavRoute.Home.route) {
        HomePage(drawerState = drawerState)
    }
}

private fun NavGraphBuilder.reviewPage(drawerState: DrawerState) {
    composable(NavRoute.Map.route) {
        ReviewPage(drawerState = drawerState)
    }
}
