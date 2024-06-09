package tn.droidzed.kmodoro.features.home.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.annotation.ExperimentalVoyagerApi
import cafe.adriel.voyager.core.lifecycle.LifecycleEffectOnce
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.core.screen.uniqueScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import core.components.Center
import core.components.KModoroAppBar
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import tn.droidzed.kmodoro.core.config.BundledScreen
import tn.droidzed.kmodoro.getPlatform

class WelcomeScreen : BundledScreen {

    override val key: ScreenKey = uniqueScreenKey

    @OptIn(ExperimentalVoyagerApi::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val platform = remember { getPlatform() }

        var visible by remember {
            mutableStateOf(false)
        }

        LifecycleEffectOnce {
            runBlocking {
                delay(1_000L)
            }
            visible = true
        }

        Scaffold(
            topBar = { KModoroAppBar() }
        ) {
            AnimatedVisibility(visible) {
                Center {
                    Column {
                        Text("${platform.name} v${platform.appVersion}")

                        Button(onClick = { navigator.push(DashboardScreen()) }) {
                            Text("Go to dashboard")
                        }
                    }
                }
            }
        }
    }
}
