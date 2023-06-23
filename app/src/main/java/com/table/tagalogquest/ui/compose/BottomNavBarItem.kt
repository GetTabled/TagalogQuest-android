package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.table.tagalogquest.R

@Composable
fun BottomNavBarItem(isActive: Boolean, imageVector: Int, modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center) {
            Image(
                imageVector = ImageVector.vectorResource(
                    id = imageVector
                ),
                contentDescription = imageVector.toString()
            )
            if (isActive) {
                Box(
                    modifier = Modifier
                        .background(Color(16, 79, 162, 100))
                        .border(5.dp, Color(16, 79, 162, 255))
                        .size(170.dp)
                )
            }
    }
}

@Preview
@Composable
fun BottomNavBarItemPreview() {
    BottomNavBarItem(true, R.drawable.ic_launcher_background)
}