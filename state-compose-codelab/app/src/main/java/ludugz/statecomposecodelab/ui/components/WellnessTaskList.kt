package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ludugz.statecomposecodelab.model.WellnessTask

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    taskList: List<WellnessTask>,
    onItemClose: (WellnessTask) -> Unit,
    onCheckedChange: (Int, Boolean) -> Unit,
) {
    LazyColumn {
        items(taskList, key = { item -> item.id }) { item ->
            WellnessTaskItem(
                taskName = item.label,
                checked = item.checked.value,
                onClose = { onItemClose(item) },
                onCheckedChange = { onCheckedChange(item.id, it) }
            )
        }
    }
}