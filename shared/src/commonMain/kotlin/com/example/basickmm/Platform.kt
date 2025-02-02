package com.example.basickmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform