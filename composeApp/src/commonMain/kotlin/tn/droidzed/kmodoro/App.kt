package tn.droidzed.kmodoro

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import core.components.KModoroAppBar
import core.config.KModoroTheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import tn.droidzed.kmodoro.features.home.di.HomeModule
import tn.droidzed.kmodoro.features.home.ui.screens.WelcomeScreen

@Composable
@Preview
fun App() {

    startKoin {
        modules(HomeModule)
    }

    KModoroTheme {
        Navigator(
            screen = WelcomeScreen(),
            disposeBehavior = NavigatorDisposeBehavior(disposeSteps = false),
        ) {
            Scaffold(
                topBar = { KModoroAppBar() },
                content = { CurrentScreen() },
//                bottomBar = { /* ... */ }
            )
        }
    }
}
