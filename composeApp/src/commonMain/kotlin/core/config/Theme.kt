package core.config

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun KModoroTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme {
        content()
    }
}