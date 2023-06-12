package com.droiddude.samples.stateincompose.ui.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.droiddude.samples.stateincompose.model.WellnessTask

class WellnessViewModel : ViewModel() {

    private val _tasks = getWellnessTasks().toMutableStateList()

    val tasks : List<WellnessTask>
        get() = _tasks

    fun checkOrUncheck(item : WellnessTask, checked : Boolean) {
        tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
    }

    fun remove(item : WellnessTask) {
        _tasks.remove(item)
    }
}

private fun getWellnessTasks() = List(30) { index ->  WellnessTask(index , "Task $index", false) }
