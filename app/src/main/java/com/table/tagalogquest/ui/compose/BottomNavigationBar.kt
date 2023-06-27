package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.table.tagalogquest.R
import com.table.tagalogquest.data.BottomNavigationBarItemModel
import com.table.tagalogquest.data.NavigationRoutes


@Composable
fun BottomNavigationBar(
    items: List<BottomNavigationBarItemModel>,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(209, 209, 209))
    ) {
        items.forEach { item ->
            val selected = item.route == currentDestination?.route
            BottomNavigationBarItem(
                selected = selected,
                icon = item.icon,
                onItemClick = {
                    navController.navigate(item.route)
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomNavigationBarPreview() {
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
        navController = rememberNavController()
    )
}