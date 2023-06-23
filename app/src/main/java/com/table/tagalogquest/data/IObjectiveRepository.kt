package com.table.tagalogquest.data

import com.table.tagalogquest.data.remote.models.Objective

interface IObjectiveRepository {

    suspend fun getAllObjectives(): List<Objective>

    suspend fun getObjectiveById(id: Int): Objective

    suspend fun createObjective(objective: Objective)

    suspend fun updateObjective(objective: Objective)

    suspend fun deleteObjective(objective: Objective)
}