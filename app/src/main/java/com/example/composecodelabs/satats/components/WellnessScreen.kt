package com.example.composecodelabs.satats.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composecodelabs.satats.WellnessViewModel

@Composable
fun WellnessScreen(modifier: Modifier = Modifier, viewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        WaterStateFullCounter(modifier = modifier)
        WellnessTasksList(list = viewModel.task, onCloseTask = { task -> viewModel.remove(task) })

    }
}