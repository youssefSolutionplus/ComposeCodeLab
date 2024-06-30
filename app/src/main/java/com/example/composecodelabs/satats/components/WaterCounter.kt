package com.example.composecodelabs.satats.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterStateFullCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableIntStateOf(0) }
    WaterStatelessCounter(count, onIncrement = { count++ }, modifier = modifier)
}

@Composable
private fun WaterStatelessCounter(
    count: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview(modifier: Modifier = Modifier) {
    WaterStateFullCounter()
}