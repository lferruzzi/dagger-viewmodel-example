package br.com.hashubeck.daggerviewmodelexample.di.main

import androidx.lifecycle.ViewModel
import br.com.hashubeck.daggerviewmodelexample.di.ViewModelKey
import br.com.hashubeck.daggerviewmodelexample.main.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Dagger [Module] to provide [br.com.hashubeck.daggerviewmodelexample.ui.MainViewModel].
 */
@Module
abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}
