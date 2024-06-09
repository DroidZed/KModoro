package tn.droidzed.kmodoro


class JVMPlatform : Platform {
    override val name: String = "Desktop"
    override val appVersion: String = "1.0.0"
}

actual fun getPlatform(): Platform = JVMPlatform()

actual typealias JavaSerializable = java.io.Serializable
