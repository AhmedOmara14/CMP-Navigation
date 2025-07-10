package com.omaradev.navigation.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.omaradev.navigation.ui.details.ui.DetailsScreenContent
import com.omaradev.navigation.ui.details.navigation.MockDetailsNavigator

@Preview
@Composable
private fun VoyagerDetailsScreenPreview() {
    DetailsScreenContent(
        detailsNavigator = MockDetailsNavigator()
    )
}
