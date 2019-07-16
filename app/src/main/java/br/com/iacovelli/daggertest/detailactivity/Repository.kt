package br.com.iacovelli.daggertest.detailactivity

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface Repository{
    fun sendAge(): Unit
}

class RepositoryImpl @Inject constructor(
    @Named("age") private val age: Int
): Repository {

    override fun sendAge() {
        Log.d("mobo", "Age is: $age")
    }
}