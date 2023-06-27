package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.table.tagalogquest.R
import com.table.tagalogquest.data.BottomNavigationBarItemModel
import com.table.tagalogquest.data.NavigationRoutes

/*
    This Composable shows all the different screens
 */

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier.weight(1f)) {
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
        BottomNavigationBar(
            items = listOf(
                BottomNavigationBarItemModel(
                    name = "Home",
                    route = NavigationRoutes.HOME,
                    icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_background)
                ),
                BottomNavigationBarItemModel(
                    name = "Settings",
                    route = NavigationRoutes.SETTINGS,
                    icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_background)
                )
            ),
            navController = navHostController
        )
    }

}