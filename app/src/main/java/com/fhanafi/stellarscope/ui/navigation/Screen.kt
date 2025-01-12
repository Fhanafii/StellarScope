package com.fhanafi.stellarscope.ui.navigation

sealed class Screen( val route: String) {
    object Home: Screen("home")
    object Favorite: Screen("favorite")
    object Profile: Screen("profile")
}