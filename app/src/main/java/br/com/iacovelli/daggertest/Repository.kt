package br.com.iacovelli.daggertest

import android.app.Application
import android.util.Log
import javax.inject.Inject

interface Repository {
    fun fetchData(): Unit
}

class RepositoryImpl @Inject constructor(private val application: Application): Repository {

    override fun fetchData() {
        Log.d("mobo", "debugging here: ${application.javaClass.simpleName}")
    }
}
