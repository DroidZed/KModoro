@file:Suppress("OPTIONAL_DECLARATION_USAGE_IN_NON_COMMON_SOURCE")

package tn.droidzed.kmodoro.features.home.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.annotation.ExperimentalVoyagerApi
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.koin.koinScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.ScreenTransition
import core.components.Center
import tn.droidzed.kmodoro.Parcelize
import tn.droidzed.kmodoro.core.config.ParcelableScreen
import tn.droidzed.kmodoro.core.navigation.SlideVerticalTransition
import tn.droidzed.kmodoro.features.home.ui.viewmodels.HomeViewModel
import tn.droidzed.kmodoro.getPlatform

@OptIn(ExperimentalVoyagerApi::class)
@Parcelize
class WelcomeScreen : ParcelableScreen, ScreenTransition by SlideVerticalTransition() {

    override val key = uniqueScreenKey

    @Composable
    override fun Content() {
        val screenModel = koinScreenModel<HomeViewModel>()

        val navigator = LocalNavigator.currentOrThrow

        Center {
            Column {
                Text("Client:" + getPlatform().name)

                Button(onClick = { navigator.push(DashboardScreen()) }) {
                    Text("Go to dashboard")
                }


            }
        }
    }
}