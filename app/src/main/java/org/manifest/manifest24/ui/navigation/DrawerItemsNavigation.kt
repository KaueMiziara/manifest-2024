package org.manifest.manifest24.ui.navigation

import androidx.compose.material3.DrawerState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import org.manifest.manifest24.ui.pages.HomePage
import org.manifest.manifest24.ui.pages.ReviewPage

fun NavGraphBuilder.homePage(drawerState: DrawerState) {
    composable(NavRoute.Home.route) {
        HomePage(drawerState = drawerState)
    }
}

fun NavGraphBuilder.reviewPage(drawerState: DrawerState) {
    composable(NavRoute.Map.route) {
        ReviewPage(drawerState = drawerState)
    }
}

fun NavHostController.navigateTo(item: NavigationItem) {
    navigate(item.route)
}
