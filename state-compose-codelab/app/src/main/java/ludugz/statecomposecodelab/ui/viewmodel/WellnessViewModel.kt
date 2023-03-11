package ludugz.statecomposecodelab.ui.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import ludugz.statecomposecodelab.model.WellnessTask

class WellnessViewModel : ViewModel() {
    var tasks = getWellnessTasks().toMutableStateList()
    var count = 0

    fun remove(item: WellnessTask) {
        tasks.remove(item)
    }

    fun changeTaskChecked(id: Int, isChecked: Boolean) {
        tasks.find { item -> id == item.id }?.let { item ->
            item.checked.value = isChecked
        }
    }
}

fun getWellnessTasks() = List(30) { i ->
    WellnessTask(i, "Task #${i}")
}
