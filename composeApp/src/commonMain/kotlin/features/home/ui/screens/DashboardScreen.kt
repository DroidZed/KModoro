package features.home.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import core.components.Center
import features.home.ui.viewmodels.HomeViewModel

class DashboardScreen : Screen {
    @Composable
    override fun Content() {
        val screenModel = getScreenModel<HomeViewModel>()

        Center {
            Text("Dashboard lol !")

            Column {

            }
        }
    }
}