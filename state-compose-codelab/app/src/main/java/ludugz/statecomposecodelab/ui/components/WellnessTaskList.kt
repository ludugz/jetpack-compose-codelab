package ludugz.statecomposecodelab.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import ludugz.statecomposecodelab.model.WellnessTask
import ludugz.statecomposecodelab.model.getWellnessTasks

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember {
        getWellnessTasks()
    }
) {
    LazyColumn {
        items(list) { item ->
            WellnessTaskItem(taskName = item.label)
        }
    }
}