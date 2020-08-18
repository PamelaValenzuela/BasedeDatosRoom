package com.example.martes18.model

import com.example.martes18.dataBase.TaskDao

class TaskRepository(private val mTaskDao: TaskDao) {

    //Este value va a contener todos los task desde  la base de datos
    val mAllTask : List<Task> = mTaskDao.getAllTask()

    //función que va escribir sobre la base de datos, que se comunica con el Dao e inserta en la base de datos

    fun inserTask(task: Task){
        mTaskDao.insertTask(task)
    }


}