package features.home.di

import features.home.ui.viewmodels.HomeViewModel
import org.koin.dsl.module

val HomeModule = module {
    factory {
        HomeViewModel()
    }
}