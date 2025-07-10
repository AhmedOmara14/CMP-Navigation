package com.omaradev.navigation.ui.home

import cafe.adriel.voyager.navigator.Navigator
import com.omaradev.navigation.ui.details.ui.DetailsScreen

open class HomeNavigator(private val navigator: Navigator) {
    fun goToDetails() {
        navigator.push(DetailsScreen)
    }
}