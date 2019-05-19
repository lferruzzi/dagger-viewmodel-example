package br.com.hashubeck.daggerviewmodelexample.di

import br.com.hashubeck.daggerviewmodelexample.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindsMainActivity(): MainActivity
}
