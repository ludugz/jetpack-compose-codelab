package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(
    modifier: Modifier = Modifier,
    count: Int,
    onValueChange: () -> Unit,
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        OutlinedButton(
            onClick = onValueChange,
            Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text("Add one")
        }
    }
}

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by remember {
        mutableStateOf(0)
    }
    StatelessCounter(count = count) {
        count++
    }

}

@Preview(showBackground = true)
@Composable
fun StatefulCounterPreview() {
    StatefulCounter()
}

