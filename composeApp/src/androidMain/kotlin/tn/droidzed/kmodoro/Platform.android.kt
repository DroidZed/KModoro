package tn.droidzed.kmodoro

import android.os.Build
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

actual typealias CommonParcelize = Parcelize

actual typealias CommonParcelable = Parcelable