package br.com.iacovelli.daggertest

import javax.inject.Inject

interface ViewModel {
    fun start()
}

class HomeViewModel @Inject constructor(
    private val repository: Repository
): ViewModel {

    override fun start() {
        repository.fetchData()
    }

}