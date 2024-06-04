package core.components


import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun KModoroAppBar() {
    return TopAppBar(
        title = { Text("KModoro") }
    )
}
