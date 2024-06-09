package tn.droidzed.kmodoro.features.home.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.components.Center
import core.components.KModoroAppBar
import tn.droidzed.kmodoro.core.config.BundledScreen
import tn.droidzed.kmodoro.features.home.ui.viewmodels.HomeViewModel


class DashboardScreen : BundledScreen {

    override val key: ScreenKey = uniqueScreenKey

    @Composable
    override fun Content() {
        val screenModel = getScreenModel<HomeViewModel>()

        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = { KModoroAppBar() }
        ) {
            Center {
                Column {
                    Text("Dashboard lol !")
                }
            }
        }
    }
}
