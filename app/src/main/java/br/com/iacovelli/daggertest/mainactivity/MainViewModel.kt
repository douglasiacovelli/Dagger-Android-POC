package br.com.iacovelli.daggertest.mainactivity

import android.arch.lifecycle.ViewModel
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {

    init {
        repository.fetchData().enqueue(object: Callback<Unit> {
            override fun onFailure(call: Call<Unit>, t: Throwable) {
                Log.e("mobo", "error")
            }

            override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                Log.d("mobo", "ok")
            }

        })
    }

}