package com.omaradev.navigation

import androidx.compose.runtime.Composable
import com.omaradev.navigation.PreCompose.navigation.NavGraph
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
   /*
   * To Start Voyager Navigation
   Navigator(HomeScreen)
   */

    PreComposeApp {
        NavGraph()

    }
}