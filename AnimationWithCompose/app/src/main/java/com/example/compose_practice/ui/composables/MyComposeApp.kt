package com.example.compose_practice.ui.composables

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose_practice.ui.theme.Compose_PracticeTheme

@Composable
fun MyComposeApp(
    modifier: Modifier = Modifier,
) {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
    Compose_PracticeTheme() {
        Surface(modifier) {
            if(shouldShowOnboarding) {
                OnboardingScreen(onContinueClicked = {shouldShowOnboarding = false})
            } else {
                Greetings()
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320,uiMode = UI_MODE_NIGHT_YES, name = "Dark")
@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    MyComposeApp(modifier = Modifier.fillMaxSize())
}