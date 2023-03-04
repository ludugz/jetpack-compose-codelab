package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        var count by remember {
            mutableStateOf(value = 0)
        }
        if (count > 0) {
            var enableTask by remember {
                mutableStateOf(true)
            }
            if (enableTask) {
                WellnessTaskItem(taskName = "Have you taken your 15 min walk today?") {
                    enableTask = false
                }
            }
            Text(text = "You have $count glasses")
        }
        Row(modifier = Modifier.padding(8.dp)) {
            OutlinedButton(
                onClick = { count++ },
                modifier = Modifier.background(color = Color.Gray),
                enabled = count < 10
            ) {
                Text(
                    text = "Add One",
                )
            }
            OutlinedButton(
                onClick = { count = 0 },
                modifier = Modifier.background(color = Color.Gray),
                enabled = count < 10
            ) {
                Text(
                    text = "Clear",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    WaterCounter()
}