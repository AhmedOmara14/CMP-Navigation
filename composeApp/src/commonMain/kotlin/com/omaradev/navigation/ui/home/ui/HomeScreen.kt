package com.omaradev.navigation.ui.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.omaradev.navigation.ui.home.navigation.HomeNavigator
import com.omaradev.navigation.ui.home.navigation.HomeNavigatorImpl

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val homeNavigator = remember { HomeNavigatorImpl(navigator) }
        HomeScreenContent(
            homeNavigator = homeNavigator
        )
    }
}


@Composable
fun HomeScreenContent(homeNavigator: HomeNavigator) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { homeNavigator.goToDetails() }) {
            Text("Go to Details")
        }
    }
}