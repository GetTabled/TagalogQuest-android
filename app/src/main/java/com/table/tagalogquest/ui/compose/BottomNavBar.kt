package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.table.tagalogquest.R

@Composable
fun BottomNavBar(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(46, 51, 56))
    ) {
        BottomNavBarItem(true, R.drawable.ic_launcher_background)
        BottomNavBarItem(false, R.drawable.ic_launcher_background)
        BottomNavBarItem(false, R.drawable.ic_launcher_background)
    }
}

@Preview
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}