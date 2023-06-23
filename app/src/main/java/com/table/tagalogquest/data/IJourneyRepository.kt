package com.table.tagalogquest.data

import com.table.tagalogquest.data.remote.models.Journey

interface IJourneyRepository {

    suspend fun getAllJourneys(): List<Journey>

    suspend fun getJourneyById(id: Int): Journey

    suspend fun createJourney(journey: Journey)

    suspend fun updateJourney(journey: Journey)

    suspend fun deleteJourney(journey: Journey)
}