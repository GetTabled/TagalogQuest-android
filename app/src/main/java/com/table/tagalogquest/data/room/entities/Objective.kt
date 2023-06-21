package com.table.tagalogquest.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
    Defines a single Objective entity
 */

@Entity(tableName = "objectives")
data class Objective(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "objective_text") val questionText: String,
    @ColumnInfo(name = "answer") val answerText: String,
    @ColumnInfo(name = "task_id") val questID: Int,
    @ColumnInfo(name = "hint_text") val hintText: String?,
    @ColumnInfo(name = "note_text") val noteText: String?,
)