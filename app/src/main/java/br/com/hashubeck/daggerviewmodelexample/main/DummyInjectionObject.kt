package br.com.hashubeck.daggerviewmodelexample.main

import javax.inject.Inject

/**
 * Singleton Dummy object to demonstrate the injection into a ViewModel.
 */
class DummyInjectionObject @Inject constructor() {

    val dummyString = "Hello Dagger"
}
