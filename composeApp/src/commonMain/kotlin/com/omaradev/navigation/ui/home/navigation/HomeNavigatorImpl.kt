package com.omaradev.navigation.ui.home.navigation

import cafe.adriel.voyager.navigator.Navigator
import com.omaradev.navigation.ui.details.ui.DetailsScreen

class HomeNavigatorImpl(private val navigator: Navigator) : HomeNavigator {
    override fun goToDetails() {
        navigator.push(DetailsScreen)
    }
}