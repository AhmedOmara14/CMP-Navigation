# 🧭 KMP Navigation Samples – Voyager & PreCompose

This Kotlin Multiplatform (KMP) project demonstrates two navigation approaches using **Jetpack Compose**:

1. **[Voyager Navigation](https://github.com/adrielcafe/voyager)** – screen-based, scalable navigation
2. **[PreCompose Navigation](https://github.com/Tlaster/PreCompose)** – type-safe, route-based navigation with lightweight setup

---

## 🚀 Purpose

The goal of this project is to practice and demonstrate clean, testable navigation setups using both **Voyager** and **PreCompose**, with shared concepts across:

- `HomeScreen`  
- `DetailsScreen`  
- Navigation with and without arguments  
- Preview support

---

## 📱 Screens

- **HomeScreen** → Entry screen that lists items and navigates forward
- **DetailsScreen** → Receives item data and displays details

---

## 🧭 Navigation Approaches

### 🌀 Voyager (Screen-based)
- Uses `Screen` implementations for each destination
- Navigation via `Navigator.push(...)`
- Clean separation using `HomeNavigator` / `DetailsNavigator` interfaces
- Previews use `MockNavigators` for isolated screen testing

### 🔁 PreCompose (Route-based)
- Uses `NavHost`, `scene`, `Navigator`, and dynamic route strings
- Passes arguments like `id` and `name` through encoded routes
- `popBackStack()` used to navigate up
- Minimal boilerplate and great for KMP targets

---

## ✨ PreCompose Sample

```kotlin
enum class Features(val route: String) {
    Home("/Home"),
    Details("/Details");

    companion object {
        fun detailsWithArgs(id: Int, name: String): String =
            "/Details/$id/${Uri.encode(name)}"

        const val DetailsRouteWithArgs = "/Details/{id}/{name}"
    }
}

@Composable
fun NavGraph(navController: Navigator = rememberNavigator()) {
    NavHost(navigator = navController, initialRoute = Features.Home.route) {
        scene(Features.Home.route) {
            HomeScreen { item ->
                navController.navigate(Features.detailsWithArgs(item.id, item.name))
            }
        }
        scene(Features.DetailsRouteWithArgs) { backStackEntry ->
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
