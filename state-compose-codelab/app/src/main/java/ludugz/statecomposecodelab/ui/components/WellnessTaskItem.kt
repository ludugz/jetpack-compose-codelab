package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ludugz.statecomposecodelab.ui.WellnessScreenPreview

// Stateless
@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier,
    taskName: String = "",
    checked: Boolean,
    onClose: () -> Unit,
    onCheckedChange: (Boolean) -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(text = taskName, modifier = Modifier
            .padding(start = 16.dp)
            .weight(weight = 4f))

        Checkbox(
            modifier = Modifier.weight(1f),
            checked = checked,
            onCheckedChange = onCheckedChange
        )

        IconButton(
            modifier = Modifier.weight(1f),
            onClick = onClose
        ) {
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = null
            )
        }
    }
}

// Stateful
@Composable
fun WellnessTaskItem(taskName: String, onClose: () -> Unit) {
    var checkedState by rememberSaveable {
        mutableStateOf(false)
    }
    WellnessTaskItem(
        taskName = taskName,
        checked = checkedState,
        onClose = onClose,
        onCheckedChange = { checked -> checkedState = checked }
    )
}

@Preview
@Composable
fun PreviewWellnessTaskItem() {
    WellnessScreenPreview()
}