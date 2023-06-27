package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun BottomNavigationBarItem(
    selected: Boolean,
    icon: ImageVector,
    onItemClick: () -> Unit
) {
    Box(contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(110.dp)
                .then(
                    if (selected)
                        Modifier.background(
                            shape = RoundedCornerShape(40.dp),
                            color = Color(16, 79, 162, 100)
                        )
                    else Modifier
                )
                .then(
                    if (selected)
                        Modifier.border(
                            shape = RoundedCornerShape(40.dp),
                            border = BorderStroke(
                                5.dp,
                                Color(16, 79, 162, 255)
                            )
                        )
                    else Modifier
                )
                .padding(25.dp)
                .clickable { onItemClick() }
        ) {
            Image(
                imageVector = icon,
                contentDescription = icon.toString()
            )
        }
    }
}

@Preview
@Composable
fun BottomNavigationBarItemPreview() {
    BottomNavigationBarItem(
        selected = true,
        icon = ImageVector.vectorResource(id = R.drawable.ic_launcher_background),
        onItemClick = {}
    )
}