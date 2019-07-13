package br.com.iacovelli.daggertest.mainactivity

import android.app.Application
import android.util.Log
import retrofit2.Retrofit
import javax.inject.Inject

interface Repository {
    fun fetchData(): Unit
}

class RepositoryImpl @Inject constructor(private val application: Application, private val retrofit: Retrofit):
    Repository {

    override fun fetchData() {
        Log.d("mobo", "debugging here: ${application.javaClass.simpleName}")
    }
}
