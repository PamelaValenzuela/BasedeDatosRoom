package com.example.martes18.dataBase

import androidx.room.*
import com.example.martes18.model.Task

// le digo al interfaz peremite conectarnos e interactuar con la base de datos
@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(task: Task)

    @Insert
    fun insertMultipleTask(List: List<Task>)

    @Update
    fun updateTask(task: Task)

    @Delete

    fun deleteOneTask(task: Task)

    @Query("SELECT * FROM task_table ORDER BY idTask ASC")

    fun getAllTask(): List<Task>


}