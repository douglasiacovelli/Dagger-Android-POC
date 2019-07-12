package br.com.iacovelli.daggertest

import android.util.Log
import javax.inject.Inject

interface FragmentViewModel {
    fun start()
}

class FragmentViewModelImpl @Inject constructor(): FragmentViewModel {
    override fun start() {
        Log.d("mobo", "starting fragment view model")
    }
}