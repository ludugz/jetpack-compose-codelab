package com.example.codelab_1st_basic_compose.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codelab_1st_basic_compose.ui.theme.BasicComposeTheme

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colorScheme.primary, modifier = Modifier.padding(24.dp)) {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }
}
