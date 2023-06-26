package com.table.tagalogquest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.table.tagalogquest.ui.compose.Navigation
import com.table.tagalogquest.ui.theme.TagalogQuestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TagalogQuestTheme {
                val navHostController = rememberNavController()
                Navigation(navHostController = navHostController)
            }
        }
    }
}