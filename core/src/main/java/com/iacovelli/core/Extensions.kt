package com.iacovelli.core

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import kotlin.reflect.KClass

fun AppCompatActivity.getViewModel(viewModelClass: KClass<out ViewModel>, factory: ViewModelProvider.Factory): ViewModel {
    return ViewModelProviders.of(this, factory).get(viewModelClass.java)
}