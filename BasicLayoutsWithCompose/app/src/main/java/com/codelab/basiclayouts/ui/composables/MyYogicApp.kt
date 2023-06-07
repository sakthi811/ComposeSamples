package com.codelab.basiclayouts.ui.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.theme.MyYogicAppTheme

@Composable
fun MyYogicApp() {
    MyYogicAppTheme() {
        Scaffold(
            bottomBar = { AppBottomNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MyYogicAppPreview() {
    MyYogicApp()
}