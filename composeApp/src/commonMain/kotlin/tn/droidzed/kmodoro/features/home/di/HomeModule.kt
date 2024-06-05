package tn.droidzed.kmodoro.features.home.di

import org.koin.dsl.module
import tn.droidzed.kmodoro.features.home.ui.viewmodels.HomeViewModel

val HomeModule = module {
    factory {
        HomeViewModel()
    }
}
