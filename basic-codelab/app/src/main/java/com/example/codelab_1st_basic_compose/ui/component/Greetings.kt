package com.example.codelab_1st_basic_compose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun Greetings(modifier: Modifier = Modifier, names: List<String>) {
    Column(
        modifier = modifier
    ) {
        for (name in names) {
            Greeting(name = name)
        }
    }
}