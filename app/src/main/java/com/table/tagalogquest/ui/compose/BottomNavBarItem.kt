package com.table.tagalogquest.ui.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun BottomNavBarItem(isActive: Boolean, imageVector: Int, modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center) {

            if (isActive) {
                Box(
                    modifier = Modifier
                        .size(110.dp)
                        .background(
                            shape =  RoundedCornerShape(40.dp),
                            color = Color(16, 79, 162, 100)
                        )
                        .border(
                            shape = RoundedCornerShape(40.dp),
                            border = BorderStroke(
                                5.dp,
                                Color(16, 79, 162, 255)
                            )
                        )
                        .padding(25.dp)

                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(
                            id = imageVector
                        ),
                        contentDescription = imageVector.toString()
                    )
                }
            }
            else {
                Box(
                    modifier = Modifier
                        .size(110.dp)
                        .padding(25.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(
                            id = imageVector
                        ),
                        contentDescription = imageVector.toString()
                    )
                }
            }
    }
}

@Preview
@Composable
fun BottomNavBarItemPreview() {
    BottomNavBarItem(true, R.drawable.ic_launcher_background)
}