package features.home.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.components.Center
import features.home.ui.viewmodels.HomeViewModel

class FirstScreen : Screen {
    @Composable
    override fun Content() {
        val screenModel = getScreenModel<HomeViewModel>()

        val navigator = LocalNavigator.currentOrThrow

        Center {
            Column {
                Text("Hi, You're at the level: ${navigator.level} !")

                Button(onClick = { navigator.push(DashboardScreen()) }) {
                    Text("Go to dashboard")
                }
            }
        }
    }
}