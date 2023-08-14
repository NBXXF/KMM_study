package com.xxf.kmm.study

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform