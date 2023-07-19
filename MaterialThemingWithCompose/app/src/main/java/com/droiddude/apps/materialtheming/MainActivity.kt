package com.droiddude.apps.materialtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.droiddude.apps.materialtheming.ui.composables.WoofApp
import com.droiddude.apps.materialtheming.ui.theme.WoofTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    WoofApp()
                }
            }
        }
    }
}

@Preview()
@Composable
fun WoofAppPreview() {
    WoofTheme(darkTheme = false) {
        WoofApp()
    }
}

@Preview()
@Composable
fun WoofAppDarkThemePreview() {
    WoofTheme(darkTheme = true) {
        WoofApp()
    }
}