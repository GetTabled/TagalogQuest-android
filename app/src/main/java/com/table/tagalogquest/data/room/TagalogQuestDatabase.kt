package com.table.tagalogquest.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

private const val DB_NAME = "tagalog_quest.db"

@Database(entities = [Quest::class], version = 1)
abstract class TagalogQuestDatabase: RoomDatabase() {

    // List of associated DAO's in this database
    abstract fun questDao(): QuestDao

    // Singleton instance of the database
    companion object {
        @Volatile
        private var INSTANCE: TagalogQuestDatabase? = null

        @Synchronized
        operator fun get(context: Context): TagalogQuestDatabase {
            if (INSTANCE == null) {
                // Create new database instance
                INSTANCE =
                    Room.databaseBuilder(
                        context,
                        TagalogQuestDatabase::class.java,
                        DB_NAME
                    ).build()
            }
            return INSTANCE!!
        }
    }
}