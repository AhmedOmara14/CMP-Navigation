# Voyager Navigation Sample

This is a simple Kotlin Multiplatform (KMP) project demonstrating usage of the [Voyager Navigation Library](https://github.com/adrielcafe/voyager) with Jetpack Compose.

## 🚀 Purpose

The goal of this project is to **practice and demonstrate clean navigation using Voyager** across a Home and Details screen setup.


## 📱 Screens

- **HomeScreen** → displays a basic UI and navigates to the DetailsScreen
- **DetailsScreen** → shows details

## 🧭 Navigation

- Navigation is handled using **Voyager Screens**
- Navigator interfaces (`HomeNavigator`, `DetailsNavigator`) separate logic for testability
- Mock implementations are used in `Preview` files for UI previewing without real navigation

## ✅ Highlights

- Clean separation of screens and navigation logic
- Previews work with `MockNavigators`
- Scalable structure for adding more screens

## ▶️ How to Run

Open the project in **Android Studio**, and run the app on an Android device or emulator.

To preview screens:
- Open `HomeScreenPreview.kt` or `DetailsScreenPreview.kt`
- Click **"Split"** or **"Design"** view to see Jetpack Compose Preview

## 🛠 Tech Stack

- Kotlin Multiplatform
- Jetpack Compose
- Voyager Navigation
- Compose Previews



