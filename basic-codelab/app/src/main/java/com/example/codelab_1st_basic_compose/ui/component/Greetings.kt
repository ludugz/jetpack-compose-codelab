package com.example.codelab_1st_basic_compose.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


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