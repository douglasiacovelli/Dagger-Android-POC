package br.com.iacovelli.daggertest.mainactivity

import android.util.Log
import retrofit2.Call
import javax.inject.Inject

interface Repository {
    fun fetchData(): Call<Unit>
}

class RepositoryImpl @Inject constructor(
    private val service: MainService
) : Repository {

    override fun fetchData(): Call<Unit> {
        Log.d("mobo", "debugging here repository")
        return service.fetchData()
    }
}
