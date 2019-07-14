package br.com.iacovelli.daggertest.mainactivity

import retrofit2.Call
import retrofit2.http.GET

interface MainService {
    @GET("bla")
    fun fetchData(): Call<Unit>
}