package com.example.codelab_1st_basic_compose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.codelab_1st_basic_compose.ui.OnboardingScreen
import com.example.codelab_1st_basic_compose.ui.component.Greetings
import com.example.codelab_1st_basic_compose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicComposeTheme {
                MyApp(modifier = Modifier.fillMaxWidth())
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    val list = List(100) { it.toString()}
    var shouldShowOnboardingScreen by rememberSaveable {
        mutableStateOf(true)
    }

    if (shouldShowOnboardingScreen) {
        OnboardingScreen {
            shouldShowOnboardingScreen = false
        }
    } else {
        Greetings(modifier = modifier, list = list)
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "Dark"
)
@Composable
fun MyAppPreview() {
    BasicComposeTheme {
        MyApp()
    }
}