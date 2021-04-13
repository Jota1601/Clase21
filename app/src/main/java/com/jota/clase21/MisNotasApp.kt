package com.jota.clase21;

import android.app.Application
import androidx.room.Room

class MisNotasApp: Application() {
    companion object {
        lateinit var database: TasksDatabase
    }

    override fun onCreate() {
        super.onCreate()
        MisNotasApp.database =  Room.databaseBuilder(this, TasksDatabase::class.java, "tasks-db").build()
    }
}