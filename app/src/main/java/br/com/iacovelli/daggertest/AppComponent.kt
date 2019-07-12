package br.com.iacovelli.daggertest

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [AndroidInjectionModule::class, ActivitiesModules::class, FragmentsModule::class, AppModule::class])
interface AppComponent: AndroidInjector<MyApplication> {

    fun inject(app: Application)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun applicationBind(application: Application): Builder
    }

}