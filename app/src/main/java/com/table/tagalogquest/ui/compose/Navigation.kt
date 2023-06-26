package com.table.tagalogquest.ui.compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.table.tagalogquest.data.NavigationRoutes

/*
    This Composable shows all the different screens
 */

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = NavigationRoutes.HOME
    ) {
        composable(NavigationRoutes.HOME) {
            HomeScreen()
        }
        composable(NavigationRoutes.SETTINGS) {
            SettingScreen()
        }
    }
}