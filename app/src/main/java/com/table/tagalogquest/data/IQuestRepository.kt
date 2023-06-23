package com.table.tagalogquest.data

import com.table.tagalogquest.data.remote.models.Quest

interface IQuestRepository {

    suspend fun getAllQuests(): List<Quest>

    suspend fun getQuestById(id: Int): Quest

    suspend fun createQuest(quest: Quest)

    suspend fun updateQuest(quest: Quest)

    suspend fun deleteQuest(quest: Quest)
}