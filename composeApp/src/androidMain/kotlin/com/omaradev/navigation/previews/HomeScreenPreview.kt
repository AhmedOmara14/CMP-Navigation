package com.omaradev.navigation.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.omaradev.navigation.Voyager.ui.home.navigation.MockHomeNavigator
import com.omaradev.navigation.Voyager.ui.home.ui.HomeScreenContent

@Preview
@Composable
private fun HomeScreenPreviewPreview() {
    HomeScreenContent(
        homeNavigator = MockHomeNavigator()
    )
}