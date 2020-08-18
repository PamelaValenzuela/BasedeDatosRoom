package com.example.martes18.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.martes18.model.Task


//añadir nombre y entities, y las TaskDao(une los Daos y las entidades)

@Database(entities = arrayOf(Task::class), version = 1, exportSchema = false )
abstract class TaskDataBase: RoomDatabase(){

    abstract fun getTaskDao(): TaskDao

    companion object{
        @Volatile
        private var INSTANCE: TaskDataBase?= null

        fun getDataBase(context : Context): TaskDataBase {
            val tempInstance =
                INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(
                    context.applicationContext,
                    TaskDataBase::class.java,
                    "task_database").build()
            INSTANCE = instance
                return instance
            }
        }
    }
}