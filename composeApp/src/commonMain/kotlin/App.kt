import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import core.components.KModoroAppBar
import core.config.KModoroTheme
import features.home.di.HomeModule
import features.home.ui.screens.FirstScreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin

@Composable
@Preview
fun App() {

    startKoin {
        modules(HomeModule)
    }

    KModoroTheme {
        Navigator(
            FirstScreen(),
            onBackPressed = {
                true // won't pop the current screen
                // true will pop, default behavior
            }
            // To disable:
            // onBackPressed = null
        ) {
            Scaffold(
                topBar = { KModoroAppBar() },
                content = { CurrentScreen() },
//                bottomBar = { /* ... */ }
            )
        }
    }
}
