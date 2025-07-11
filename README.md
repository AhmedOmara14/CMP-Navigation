# 🚀 PreCompose Navigation

This is a simple Kotlin Multiplatform (KMP) Android project demonstrating how to use **PreCompose** for type-safe, declarative navigation in a Jetpack Compose-based app.

## 📦 Tech Stack

- **Jetpack Compose**
- **PreCompose** by [@Tlaster](https://github.com/Tlaster/PreCompose)
- **Kotlin Multiplatform-ready structure**
- Minimal, clean navigation using `NavHost`, `scene`, and `Navigator`

---

## 🧭 Features

- PreCompose navigation between `HomeScreen` and `DetailsScreen`
- Dynamic route arguments (`id`, `name`) passed via the navigation route
- Back navigation using `popBackStack()`

---

## 🗺️ Navigation Setup

```kotlin
enum class Features(val route: String) {
    Home("/Home"),
    Details("/Details");

    companion object {
        fun detailsWithArgs(id: Int, name: String): String {
            return "/Details/$id/${Uri.encode(name)}"
        }

        const val DetailsRouteWithArgs = "/Details/{id}/{name}"
    }
}

@Composable
fun NavGraph(navController: Navigator = rememberNavigator()) {
    NavHost(navigator = navController, initialRoute = Features.Home.route) {

        scene(route = Features.Home.route) {
            HomeScreen { item ->
                navController.navigate(Features.detailsWithArgs(item.id, item.name))
            }
        }

        scene(route = Features.DetailsRouteWithArgs) { backStackEntry ->
            val id = backStackEntry.path<String>("id")?.toIntOrNull()
            val name = backStackEntry.path<String>("name")?.let { Uri.decode(it) }

            DetailsScreen(id = id, name = name) {
                navController.popBackStack()
            }
        }
    }
}

setContent {
    PreComposeApp {
        NavGraph()
    }
}
