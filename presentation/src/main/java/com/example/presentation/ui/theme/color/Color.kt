package com.example.presentation.ui.theme.color

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val LightBlue50 = Color(0xFFE1F5FE)
val LightBlue100 = Color(0xFFB3E5FC)
val LightBlue200 = Color(0xFF81D4FA)
val LightBlue300 = Color(0xFF4FC3F7)
val LightBlue400 = Color(0xFF29B6F6)
val LightBlue500 = Color(0xFF03A9F4)
val LightBlue600 = Color(0xFF039BE5)
val LightBlue700 = Color(0xFF0288D1)
val LightBlue800 = Color(0xFF0277BD)
val LightBlue900 = Color(0xFF01579B)
val LightBlueA100 = Color(0xFF80D8FF)
val LightBlueA200 = Color(0xFF40C4FF)

val Grey100 = Color(0xFFDDDDDD)
val Grey200 = Color(0xFF908499)
val BLUEGrey700 = Color(0xFF455A64)
val BLUEGrey800 = Color(0xFF37474F)
val Brown700 = Color(0xFF5D4037)
val Brown800 = Color(0xFF4E342E)

val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Red = Color(0xFFFF0000)
val Green = Color(0xFF00FF00)

sealed class ColorSet {
    open lateinit var lightColors: MyColors
    open lateinit var darkColors: MyColors

    object LightBlue: ColorSet() {
        override var lightColors = MyColors(
            material = lightColors(
                primary = LightBlue200,
                primaryVariant = LightBlue300,
                secondary = LightBlueA100,
                secondaryVariant = LightBlueA200,
                surface = White,
                onSurface = Black,
                background = White,
                onBackground = Black,
                error = Red,
                onPrimary = Black
            ),
            success = Green,
            disabledSecondary = Grey200,
            backgroundVariant = Grey100
        )

        override var darkColors = MyColors(
            material = darkColors(
                primary = BLUEGrey700,
                primaryVariant = BLUEGrey800,
                secondary = Brown700,
                secondaryVariant = Brown800,
                surface = Black,
                onSurface = White,
                background = Black,
                onBackground = White,
                error = Red,
                onPrimary = White,
            ),
            success = Green,
            disabledSecondary = Grey200,
            backgroundVariant = Grey100
        )
    }
}