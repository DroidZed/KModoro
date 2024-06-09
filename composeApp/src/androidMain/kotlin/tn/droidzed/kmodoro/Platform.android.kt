package tn.droidzed.kmodoro

class AndroidPlatform : Platform {
    override val name: String = "Android"
    override val appVersion: String = "1.0.0"
}

actual fun getPlatform(): Platform = AndroidPlatform()

actual typealias JavaSerializable = java.io.Serializable
