package com.table.tagalogquest.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
    Defines a single Quest entity

    In TagalogQuest, a "Quest" corresponds to the concept
    of Lessons found in other language learning applications.
 */

@Entity(tableName = "quests")
data class Quest(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String
)