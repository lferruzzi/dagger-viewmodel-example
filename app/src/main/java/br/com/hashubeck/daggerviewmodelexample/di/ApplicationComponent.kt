package br.com.hashubeck.daggerviewmodelexample.di

import android.app.Application
import br.com.hashubeck.daggerviewmodelexample.MyApplication
import br.com.hashubeck.daggerviewmodelexample.di.main.MainViewModelsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

/**
 * Main Dagger component for the Application.
 */
@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        ViewModelFactoryModule::class,
        MainViewModelsModule::class]
)
interface ApplicationComponent : AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}
