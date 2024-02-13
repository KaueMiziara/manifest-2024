package org.manifest.manifest24.ui.navigation

sealed class NavRoute(val route: String) {
    data object Home : NavRoute("home")
    data object Map : NavRoute("map")
    data object Placeholder : NavRoute("placeholder")
}
