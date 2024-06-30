package com.example.composecodelabs.satats.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WellnessTaskItemStateFull(
    taskName: String, onClick: () -> Unit, modifier: Modifier = Modifier
) {
    var checkedState by rememberSaveable { mutableStateOf(false) }

    WellnessTaskItemStateLess(
        taskName = taskName,
        checked = checkedState,
        onCheckedChange = { checkedState = it },
        onClick = onClick,
        modifier = modifier
    )
}

@Composable
fun WellnessTaskItemStateLess(
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClick: () -> Unit,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.background(color = Color.LightGray),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp), text = taskName
        )
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
        IconButton(onClick = onClick) {
            Icon(Icons.Filled.Close, contentDescription = "Close Item")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WellnessTaskItemPreview(modifier: Modifier = Modifier) {
    WellnessTaskItemStateLess(taskName = "task", checked = true, onCheckedChange = {}, onClick = {})
}