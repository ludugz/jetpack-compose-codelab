package com.example.codelab_1st_basic_compose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
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
    Surface(color = MaterialTheme.colorScheme.primary,
        modifier = Modifier
            .padding(vertical = 4.dp, horizontal = 8.dp)
            .fillMaxWidth()) {
        Row {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello!")
                Text(text = name)
            }

            ElevatedButton(onClick = { /*TODO*/ }) {
                Text("Show More")
            }
        }
    }
}

@Preview(showBackground = false, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }
}
