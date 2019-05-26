package br.com.hashubeck.daggerviewmodelexample.main.view

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import br.com.hashubeck.daggerviewmodelexample.R
import br.com.hashubeck.daggerviewmodelexample.main.viewmodel.MainViewModel
import br.com.hashubeck.daggerviewmodelexample.viewmodel.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.hello
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelProviderFactory: ViewModelProviderFactory

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(MainViewModel::class.java)
        Log.d(TAG, "mainViewModel injected, ${mainViewModel.hashCode()}")

        hello.text = mainViewModel.dummyInjectionObject.dummyString
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
