package tn.droidzed.kmodoro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

@OptIn(ExperimentalMultiplatform::class)
@OptionalExpectation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
expect annotation class CommonParcelize()

expect interface CommonParcelable
