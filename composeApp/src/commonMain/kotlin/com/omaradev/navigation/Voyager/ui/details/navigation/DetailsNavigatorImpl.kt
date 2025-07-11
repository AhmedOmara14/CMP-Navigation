package com.omaradev.navigation.Voyager.ui.details.navigation

import cafe.adriel.voyager.navigator.Navigator

class DetailsNavigatorImpl(private val navigator: Navigator) :DetailsNavigator{
    override fun goBack() {
        navigator.pop()
    }

    override fun goToNextScreen() {
        //Ignore
    }
}