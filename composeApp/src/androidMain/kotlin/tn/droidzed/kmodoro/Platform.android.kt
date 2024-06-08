package tn.droidzed.kmodoro

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
    override val appVersion: String = "1.0.0"
}

actual fun getPlatform(): Platform = AndroidPlatform()

actual typealias Parcelize = kotlinx.android.parcel.Parcelize

actual typealias Parcelable = android.os.Parcelable
