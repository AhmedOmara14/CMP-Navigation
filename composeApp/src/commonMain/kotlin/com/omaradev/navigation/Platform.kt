package com.omaradev.navigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform