package tn.droidzed.kmodoro

interface Platform {
    val name: String
    val appVersion: String
}

expect fun getPlatform(): Platform

expect interface JavaSerializable