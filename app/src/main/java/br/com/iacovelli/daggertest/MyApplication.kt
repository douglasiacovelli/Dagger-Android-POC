package br.com.iacovelli.daggertest

import android.app.Activity
import android.app.Application
import br.com.iacovelli.daggertest.di.AppComponent
import br.com.iacovelli.daggertest.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MyApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Activity>

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .applicationBind(this)
            .build()

        appComponent.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = androidInjector
}