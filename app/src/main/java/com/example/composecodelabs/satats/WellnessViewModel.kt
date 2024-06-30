package com.example.composecodelabs.satats

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.composecodelabs.satats.domain.WellnessTask

class WellnessViewModel : ViewModel() {
    private val _task = getWellnessTasks().toMutableStateList()
    val task: List<WellnessTask> get() = _task

    fun remove(item: WellnessTask) {
        _task.remove(item)
    }
}
fun getWellnessTasks()=List(30){ WellnessTask(it, "Task # $it") }