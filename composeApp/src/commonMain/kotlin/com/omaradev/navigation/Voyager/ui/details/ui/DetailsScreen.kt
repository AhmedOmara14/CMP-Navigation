package com.omaradev.navigation.Voyager.ui.details.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.omaradev.navigation.Voyager.ui.details.navigation.DetailsNavigator
import com.omaradev.navigation.Voyager.ui.details.navigation.DetailsNavigatorImpl

object DetailsScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val detailsNavigator = remember { DetailsNavigatorImpl(navigator) }
        DetailsScreenContent(detailsNavigator)
    }
}

@Composable
fun DetailsScreenContent(detailsNavigator: DetailsNavigator) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(WindowInsets.statusBars.asPaddingValues())
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "BACK",
            modifier = Modifier.padding(16.dp).size(25.dp).clickable(
                onClick = {
                    detailsNavigator.goBack()
                })
        )
        Text(
            text = "Details Screen",
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxSize()
        )
    }
}

