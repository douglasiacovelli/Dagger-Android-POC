package br.com.iacovelli.daggertest.mainactivity

import javax.inject.Inject

interface ViewModel {
    fun start()
}

class MainViewModel @Inject constructor(
    private val repository: Repository
): ViewModel {

    override fun start() {
        repository.fetchData()
    }

}