package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ludugz.statecomposecodelab.ui.WellnessScreenPreview

@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier,
    taskName: String = "",
    onClose: () -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = taskName, modifier = Modifier
            .padding(start = 16.dp)
            .weight(weight = 1f))
        IconButton(onClick = onClose) {
            Icon(imageVector = Icons.Filled.Close, contentDescription = null)
        }
    }
}

@Preview
@Composable
fun PreviewWellnessTaskItem() {
    WellnessScreenPreview()
}