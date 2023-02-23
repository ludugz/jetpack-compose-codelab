package com.example.codelab_1st_basic_compose.ui.component

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.codelab_1st_basic_compose.ui.theme.BasicComposeTheme


@Composable
fun Greetings(modifier: Modifier = Modifier, list: List<String>) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { item ->
            Greeting(name = item)
        }
    }
}

@Preview(
    showBackground = true,
    name = "Greetings Dark Preview",
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
fun GreetingsDarkPreview() {
    BasicComposeTheme(dynamicColor = false) {
        Greetings(list = List(20) { it.toString() })
    }
}

@Preview(
    showBackground = true,
    name = "Greetings Light Preview",
    uiMode = UI_MODE_NIGHT_NO
)
@Composable
fun GreetingsLightPreview() {
    BasicComposeTheme(dynamicColor = false) {
        Greetings(list = List(20) { it.toString() })
    }
}