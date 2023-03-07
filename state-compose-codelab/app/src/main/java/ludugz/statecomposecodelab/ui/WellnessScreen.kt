package ludugz.statecomposecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ludugz.statecomposecodelab.model.WellnessTask
import ludugz.statecomposecodelab.model.getWellnessTasks
import ludugz.statecomposecodelab.ui.components.StatefulCounter
import ludugz.statecomposecodelab.ui.components.WellnessTaskList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        StatefulCounter(modifier = modifier)

        val list = remember {
            mutableStateListOf<WellnessTask>().apply {
                addAll(getWellnessTasks())
            }
        }

        WellnessTaskList(taskList = list) { item ->
            list.remove(item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(modifier: Modifier = Modifier) {

}