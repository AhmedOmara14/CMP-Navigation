package com.omaradev.navigation.Voyager.ui.home.navigation

import cafe.adriel.voyager.navigator.Navigator
import com.omaradev.navigation.Voyager.ui.details.ui.DetailsScreen

class HomeNavigatorImpl(private val navigator: Navigator) : HomeNavigator {
    override fun goToDetails() {
        navigator.push(DetailsScreen)
    }
}