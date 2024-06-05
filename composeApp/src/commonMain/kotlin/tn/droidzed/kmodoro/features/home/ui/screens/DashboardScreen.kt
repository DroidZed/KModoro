package tn.droidzed.kmodoro.features.home.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.koin.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.components.Center
import tn.droidzed.kmodoro.core.config.ParcelableScreen
import tn.droidzed.kmodoro.features.home.ui.viewmodels.HomeViewModel

class DashboardScreen : ParcelableScreen {
    @Composable
    override fun Content() {
        val screenModel = getScreenModel<HomeViewModel>()

        val navigator = LocalNavigator.currentOrThrow

        Center {
            Column {
                Text("Dashboard lol !")
                Text("Hi, You're at the level: ${navigator.level} !")

            }
        }
    }
}