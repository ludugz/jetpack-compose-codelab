package com.example.codelab_1st_basic_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
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
fun MyApp(modifier: Modifier = Modifier, names: List<String> = listOf("World", "Compose")) {
    var shouldShowOnboardingScreen by remember {
        mutableStateOf(true)
    }

    if (shouldShowOnboardingScreen) {
        OnboardingScreen {
            shouldShowOnboardingScreen = false
        }
    } else {
        Greetings(modifier = modifier, names = names)
    }
}

@Preview(showBackground = false, widthDp = 320)
@Composable
fun MyAppPreview() {
    BasicComposeTheme {
        MyApp()
    }
}