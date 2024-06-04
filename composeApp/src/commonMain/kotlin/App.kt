import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
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
        Navigator(FirstScreen())
    }
}