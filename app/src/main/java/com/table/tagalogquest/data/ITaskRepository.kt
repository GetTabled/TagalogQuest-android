package com.table.tagalogquest.data

import com.table.tagalogquest.data.remote.models.Task

interface ITaskRepository {

    suspend fun getAllTasks(): List<Task>

    suspend fun getTaskById(id: Int): Task

    suspend fun createTask(task: Task)

    suspend fun updateTask(task: Task)

    suspend fun deleteTask(task: Task)
}