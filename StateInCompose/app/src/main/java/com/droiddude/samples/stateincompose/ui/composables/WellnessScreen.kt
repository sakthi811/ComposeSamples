package com.droiddude.samples.stateincompose.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.droiddude.samples.stateincompose.ui.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier : Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StatefulCounter(modifier)
        WellnessTaskList(
            list = wellnessViewModel.tasks,
            onCheckedChangeTask = { task,isChecked ->
                wellnessViewModel.checkOrUncheck(task,isChecked)
            },
            onCloseTask = { task -> wellnessViewModel.remove(task) },
        )
    }
}


@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    Column(modifier = Modifier) {
        StatefulCounter(modifier = Modifier)
        //WellnessTaskList()
    }
}

