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
) {
    LazyColumn {
        items(taskList) { item ->
            WellnessTaskItem(taskName = item.label, onClose = { onItemClose(item) })
        }
    }
}