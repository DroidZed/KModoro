package tn.droidzed.kmodoro

interface Platform {
    val name: String
    val appVersion: String
}

expect fun getPlatform(): Platform

@OptIn(ExperimentalMultiplatform::class)
@OptionalExpectation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
expect annotation class Parcelize()

expect interface Parcelable
