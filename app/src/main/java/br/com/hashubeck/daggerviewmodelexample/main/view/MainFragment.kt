package br.com.hashubeck.daggerviewmodelexample.main.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.hashubeck.daggerviewmodelexample.R

import br.com.hashubeck.daggerviewmodelexample.main.viewmodel.MainViewModel

import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_main.fragment_hello
import javax.inject.Inject

class MainFragment : DaggerFragment() {

    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
