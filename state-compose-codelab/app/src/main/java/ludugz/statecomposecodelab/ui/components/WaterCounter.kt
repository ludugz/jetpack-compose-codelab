package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 0
    Column {
        Text(
            text = "You've had $count glasses",
            modifier = Modifier
                .padding(16.dp),
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.background(color = Color.Gray),
        ) {
            Text(
                text = "Add One",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    WaterCounter()
}