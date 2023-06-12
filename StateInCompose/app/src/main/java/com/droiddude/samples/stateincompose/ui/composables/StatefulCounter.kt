package com.droiddude.samples.stateincompose.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun  StatefulCounter(modifier: Modifier = Modifier) {
    var waterCount by rememberSaveable { mutableStateOf(0) }
    var juiceCount by rememberSaveable { mutableStateOf(0) }
    Column() {
        StatelessCounter("Water", waterCount, onIncrement = { waterCount++ }, modifier)
        StatelessCounter("Juice", juiceCount, onIncrement = { juiceCount++ }, modifier)
    }

}