package com.omaradev.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.omaradev.navigation.ui.home.HomeScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    Navigator(HomeScreen)
}