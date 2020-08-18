package com.example.martes18

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task_table")
data class Task (
    @PrimaryKey(autoGenerate = true) @NonNull val idTask: Int,
  //  @ColumnInfo(name = "task_note") , esto es como un nick
    val task: String,
    val creationDate: String,
    val finishDate: String
)