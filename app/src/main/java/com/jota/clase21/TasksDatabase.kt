package com.jota.clase21;

import androidx.room.Database;
import androidx.room.RoomDatabase

@Database(entities = arrayOf(TaskEntity::class), version = 1)
abstract class TasksDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}

