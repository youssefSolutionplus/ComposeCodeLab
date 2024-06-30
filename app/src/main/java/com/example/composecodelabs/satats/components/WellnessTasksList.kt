package com.example.composecodelabs.satats.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import com.example.composecodelabs.satats.domain.WellnessTask
import com.example.composecodelabs.satats.getWellnessTasks


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    onCloseTask: (WellnessTask) -> Unit,
    list: List<WellnessTask> = remember { getWellnessTasks() }
) {
    LazyColumn(modifier = modifier) {
        items(items = list, key = { task -> task.id }) { task ->
            WellnessTaskItemStateFull(taskName = task.label, onClick = { onCloseTask(task) })
        }
    }

}