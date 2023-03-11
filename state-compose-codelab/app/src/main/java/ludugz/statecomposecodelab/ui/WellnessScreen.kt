package ludugz.statecomposecodelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import ludugz.statecomposecodelab.ui.components.StatefulCounter
import ludugz.statecomposecodelab.ui.components.WellnessTaskList
import ludugz.statecomposecodelab.ui.viewmodel.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    viewModel: WellnessViewModel = viewModel(modelClass = WellnessViewModel::class.java),
) {
    Column(modifier = modifier) {
        StatefulCounter(modifier = modifier)

        WellnessTaskList(
            taskList = viewModel.tasks,
            onItemClose = viewModel::remove,
            onCheckedChange = viewModel::changeTaskChecked
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview(modifier: Modifier = Modifier) {

}