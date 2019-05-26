package br.com.hashubeck.daggerviewmodelexample.di

import br.com.hashubeck.daggerviewmodelexample.main.view.MainActivity
import br.com.hashubeck.daggerviewmodelexample.main.view.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun bindsMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindsMainFragment(): MainFragment
}
