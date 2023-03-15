package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.codelab.theming.ui.finish.theme.Red700
import com.codelab.theming.ui.finish.theme.Red800
import com.codelab.theming.ui.finish.theme.Red900

val LightColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    onPrimary = Color.White,
    secondary = Red700,
    secondaryVariant = Red900,
    onSecondary = Color.White,
    error = Red800
)

@Composable
fun JetnewsTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = LightColors,
        typography = JetnewsTypography,
        content = content
    )
}