package com.droiddude.samples.stateincompose.ui.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.droiddude.samples.stateincompose.model.WellnessTask

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list : List<WellnessTask>,
    onCheckedChangeTask : (WellnessTask, Boolean) -> Unit,
    onCloseTask : (WellnessTask) -> Unit
    ) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = list,
        key = {task -> task.id }) {task ->
            WellnessTaskItem(
                taskName = task.label,
                checked = task.checked,
                onCheckedChange = { checked -> onCheckedChangeTask(task,checked)},
                onClose = { onCloseTask(task) },
                modifier = modifier,
            )
        }
    }
}

