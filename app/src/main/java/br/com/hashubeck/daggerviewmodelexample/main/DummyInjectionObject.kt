package br.com.hashubeck.daggerviewmodelexample.main

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Singleton Dummy object to demonstrate the injection into a ViewModel.
 */
@Singleton
class DummyInjectionObject @Inject constructor() {

    val dummyString = "Hello Dagger"
}
