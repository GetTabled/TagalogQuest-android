package com.table.tagalogquest

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.navigation.compose.rememberNavController
import com.table.tagalogquest.ui.compose.Navigation
import com.table.tagalogquest.ui.theme.TagalogQuestTheme

val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")
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