package ludugz.statecomposecodelab.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ludugz.statecomposecodelab.ui.components.WaterCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    WaterCounter(modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    WellnessScreen()
}