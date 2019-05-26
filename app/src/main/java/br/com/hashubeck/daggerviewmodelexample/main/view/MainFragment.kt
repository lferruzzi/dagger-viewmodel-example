package br.com.hashubeck.daggerviewmodelexample.main.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import br.com.hashubeck.daggerviewmodelexample.R

import br.com.hashubeck.daggerviewmodelexample.main.viewmodel.MainViewModel
import br.com.hashubeck.daggerviewmodelexample.viewmodel.ViewModelProviderFactory

import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.fragment_hello
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    @Inject lateinit var viewModelProviderFactory: ViewModelProviderFactory

    lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProviders.of(this, viewModelProviderFactory).get(MainViewModel::class.java)
        Log.d(TAG, "mainViewModel injected, ${mainViewModel.hashCode()}")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_hello.text = mainViewModel.dummyInjectionObject.dummyString
    }

    companion object {
        private const val TAG = "MainFragment"
    }
}
