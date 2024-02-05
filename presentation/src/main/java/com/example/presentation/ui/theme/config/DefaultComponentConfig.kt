package com.example.presentation.ui.theme.config

import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import com.example.presentation.ui.theme.color.ColorSet
import com.example.presentation.ui.theme.Shapes
import com.example.presentation.ui.theme.Typography

data class ComponentConfig(
    val colors: ColorSet,
    val typography: Typography,
    val shapes: Shapes
)

object DefaultComponentConfig {
    val LIGHT_BLUE_THEME = ComponentConfig(
        colors = ColorSet.LightBlue,
        shapes = Shapes,
        typography = Typography
    )
}


