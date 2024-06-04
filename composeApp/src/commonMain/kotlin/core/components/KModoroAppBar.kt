package core.components


import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

@Composable
fun KModoroAppBar() {
    val navigator = LocalNavigator.currentOrThrow
    return TopAppBar(
        title = { Text("KModoro") },
        navigationIcon = {
            IconButton(onClick = { navigator.pop() }) {
                Icon(Icons.AutoMirrored.Filled.ArrowBack, "")
            }
        }
    )
}
