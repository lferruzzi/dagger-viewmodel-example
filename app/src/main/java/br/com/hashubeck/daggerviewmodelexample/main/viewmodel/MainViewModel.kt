package br.com.hashubeck.daggerviewmodelexample.main.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import br.com.hashubeck.daggerviewmodelexample.main.DummyInjectionObject
import javax.inject.Inject
import javax.inject.Singleton

/**
 * [ViewModel] used in [MainActivity].
 */
@Singleton
class MainViewModel @Inject constructor(val dummyInjectionObject: DummyInjectionObject) : ViewModel() {

    init {
        Log.d(TAG, "init $dummyInjectionObject injected")
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}
