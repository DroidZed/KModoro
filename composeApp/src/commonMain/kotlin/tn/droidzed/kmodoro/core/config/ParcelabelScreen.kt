package tn.droidzed.kmodoro.core.config

import cafe.adriel.voyager.core.lifecycle.JavaSerializable
import cafe.adriel.voyager.core.screen.Screen
import tn.droidzed.kmodoro.Parcelable

interface ParcelableScreen : Screen, Parcelable, JavaSerializable
