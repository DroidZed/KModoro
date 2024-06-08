package tn.droidzed.kmodoro.core.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import com.akexorcist.kotlin.multiplatform.dayandnight.DayAndNightSwitch

@Composable
fun ThemeChanger() {
    var selected by remember { mutableStateOf(true) }

    DayAndNightSwitch(
        modifier = Modifier.scale(2f),
        selected = selected,
        onSwitchToggle = { selected = !selected },
    )
}
