package br.com.iacovelli.daggertest.di

import android.app.Application
import br.com.iacovelli.daggertest.MyApplication
import com.iacovelli.core.di.AppModule
import com.iacovelli.core.di.NetworkingModule
import com.iacovelli.core.di.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ViewModelModule::class,
    ActivitiesModules::class,
    FragmentsModule::class,
    NetworkingModule::class
])
interface AppComponent: AndroidInjector<MyApplication> {

    fun inject(app: Application)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun applicationBind(application: Application): Builder
    }

}