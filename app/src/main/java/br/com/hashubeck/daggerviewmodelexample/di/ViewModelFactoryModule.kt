package br.com.hashubeck.daggerviewmodelexample.di

import br.com.hashubeck.daggerviewmodelexample.viewmodel.ViewModelProviderFactory
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}
