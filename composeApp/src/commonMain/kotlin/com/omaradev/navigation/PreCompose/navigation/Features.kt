package com.omaradev.navigation.PreCompose.navigation


const val HomeRoute = "/Home"
const val DetailsRouteBase = "/Details"

enum class Features(val route: String) {
    Home(HomeRoute),
    Details(DetailsRouteBase);

    companion object {
        fun detailsWithArgs(id: Int, name: String): String {
            return "$DetailsRouteBase/$id/${name}"
        }

        const val DetailsRouteWithArgs = "$DetailsRouteBase/{id}/{name}"
    }
}
