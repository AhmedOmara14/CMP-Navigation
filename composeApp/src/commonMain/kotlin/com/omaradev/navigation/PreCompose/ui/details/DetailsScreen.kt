package com.omaradev.navigation.PreCompose.ui.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(
    onBackPressure: () -> Unit,
    id: Int?,
    name: String
) {
    DetailsScreenContent(
        onBackPressure = onBackPressure,
        id = id,
        name = name
    )
}

@Composable
fun DetailsScreenContent(
    onBackPressure: () -> Unit,
    id: Int?,
    name: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            modifier = Modifier.size(24.dp).clickable(
                onClick = {
                    onBackPressure()
                }
            )
        )
        Text(
            text = "Details Screen $id $name",
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}