package com.example.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.example.presentation.ui.theme.config.ComponentConfig
import com.example.presentation.ui.theme.config.DefaultComponentConfig


@Composable
fun ChatComposeAppTheme(
    themeState: State<ComponentConfig> = mutableStateOf(
        DefaultComponentConfig.LIGHT_BLUE_THEME
    ),
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val myTheme by remember {
        themeState
    }

    val colors = if (darkTheme) {
        myTheme.colors.darkColors
    } else {
        myTheme.colors.lightColors
    }


    MaterialTheme(
        colors = colors.material,
        typography = myTheme.typography,
        shapes = myTheme.shapes,
        content = content
    )
}
