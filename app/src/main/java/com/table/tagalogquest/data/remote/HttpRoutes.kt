package com.table.tagalogquest.data.remote

object HttpRoutes {

    // Remote base URL
    private const val BASE_URL = "" // No remote yet

    // Auth routes
    const val LOGIN= "$BASE_URL/login"
    const val REGISTER = "$BASE_URL/register"

    // Model routes
    const val ALL_JOURNEYS = "$BASE_URL/journeys"
    const val ALL_QUESTS = "$BASE_URL/quests"
    const val ALL_TASKS = "$BASE_URL/tasks"
    const val ALL_OBJECTIVES = "$BASE_URL/objectives"
}
