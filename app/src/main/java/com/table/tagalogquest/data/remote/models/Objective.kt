package com.table.tagalogquest.data.remote.models

data class Objective(
    val id: Int,
    val questionText: String,
    val answerText: String,
    val questID: Int,
    val hintText: String?,
    val noteText: String?,
)
