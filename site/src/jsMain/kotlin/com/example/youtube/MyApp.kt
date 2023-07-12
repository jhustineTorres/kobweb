package com.example.youtube

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalette
import com.varabyte.kobweb.silk.theme.colors.MutableSilkPalettes

import org.jetbrains.compose.web.css.*


@InitSilk
fun updateTheme(ctx: InitSilkContext) { //TODO: https://youtu.be/F5B-CxJTKlg?list=PLSrm9z4zp4mEWwyiuYgVMWcDFdsebhM-r&t=2067
    // Configure silk here
    ctx.theme.palettes = MutableSilkPalettes(
        light = MutableSilkPalette(
            background = Colors.White,
            color = Colors.Black,
            link = MutableSilkPalette.Link(
                default = Colors.Black,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.DarkGray,
                hover = Colors.LightGray,
                focus = Colors.LightGray,
                pressed = Colors.Gray
            ),
            tab = MutableSilkPalette.Tab(
                color = Colors.Black,
                background = Colors.White,
                selectedColor = Colors.DarkGray,
                hover = Colors.DarkGray,
                pressed = Colors.White,
                disabled = Colors.LightGray,
            ),
            switch = MutableSilkPalette.Switch(
                backgroundOn = Colors.Blue,
                backgroundOff = Colors.LightGray
            )
        ),
        dark = MutableSilkPalette(
            background = Colors.Black,
            color = Colors.White,
            link = MutableSilkPalette.Link(
                default = Colors.White,
                visited = Colors.Blue
            ),
            button = MutableSilkPalette.Button(
                default = Colors.Blue,
                hover = Colors.MediumBlue,
                focus = Colors.MediumBlue,
                pressed = Colors.DarkBlue
            ),
            tab = MutableSilkPalette.Tab(
                color = Colors.White,
                background = Colors.Black,
                selectedColor = Colors.DarkBlue,
                hover = Colors.MediumBlue,
                pressed = Colors.DarkBlue,
                disabled = Colors.MediumBlue,
            ),
            switch = MutableSilkPalette.Switch(
                backgroundOn = Colors.DarkBlue,
                backgroundOff = Colors.DarkGray
            )
        )
    )
}

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
