package ru.expv1n.playzone_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform