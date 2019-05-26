package br.com.hashubeck.daggerviewmodelexample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider

/**
 * Generic [ViewModelProvider.Factory] to create [ViewModel] instances, used with the Dagger multi-biding mapped with
 * [br.com.hashubeck.daggerviewmodelexample.di.ViewModelKey].
 */
class ViewModelProviderFactory
    @Inject constructor(
        private val creators: Map<Class<out ViewModel>,
        @JvmSuppressWildcards Provider<ViewModel>>
    ) : ViewModelProvider.Factory {

    /** If the [ViewModel] has not been created loop through the allowable keys
     * [br.com.hashubeck.daggerviewmodelexample.di.ViewModelKey]
     * if it's allowed, set the [Provider]<[ViewModel]>, otherwise throw [IllegalArgumentException].
     */
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.asIterable()
            .firstOrNull { modelClass.isAssignableFrom(it.key) }
            ?.value ?: throw IllegalArgumentException("unknown model class $modelClass")

        @Suppress("UNCHECKED_CAST")
        return creator.get() as T
    }
}
