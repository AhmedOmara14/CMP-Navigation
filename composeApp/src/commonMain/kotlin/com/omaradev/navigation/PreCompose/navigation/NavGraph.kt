package com.omaradev.navigation.PreCompose.navigation

import androidx.compose.runtime.Composable
import com.omaradev.navigation.PreCompose.ui.details.DetailsScreen
import com.omaradev.navigation.PreCompose.ui.home.HomeScreen
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.Navigator
import moe.tlaster.precompose.navigation.path
import moe.tlaster.precompose.navigation.rememberNavigator

@Composable
fun NavGraph(
    navController: Navigator = rememberNavigator(),
) {
    NavHost(
        navigator = navController,
        initialRoute = Features.Home.route
    ) {
        // Home Screen (navigate with data)
        scene(route = Features.Home.route) {
            HomeScreen(
                navigateToDetails = { id, name ->
                    navController.navigate(
                        Features.detailsWithArgs(
                            id = id,
                            name = name
                        )
                    )
                }
            )
        }

        // Details Screen (receive data)
        scene(route = Features.DetailsRouteWithArgs) { backStackEntry ->
            val id = backStackEntry.path<String>("id")?.toIntOrNull()
            val name1 = backStackEntry.path<String>("name").toString()

            DetailsScreen(
                id = id,
                name = name1,
                onBackPressure = {
                    navController.popBackStack()
                }
            )
        }
    }
}
