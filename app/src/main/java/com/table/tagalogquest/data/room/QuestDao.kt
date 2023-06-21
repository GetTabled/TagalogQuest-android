package com.table.tagalogquest.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.table.tagalogquest.data.room.entities.Quest

/*
    Data Access Object for the Quest entity
 */

@Dao
interface QuestDao {

    // Create new Quest
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun addQuest(quest: Quest)

    // Get Quest by ID
    @Query("SELECT * FROM quests WHERE id = :questId")
    suspend fun getQuestById(questId: Long): Quest?

    // Get all Quests
    @Query("SELECT * FROM quests")
    suspend fun getAllQuests(): List<Quest>

    // Delete Quest
    @Delete
    suspend fun deleteQuest(quest: Quest)
}