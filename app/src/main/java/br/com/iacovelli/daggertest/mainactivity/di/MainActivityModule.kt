package br.com.iacovelli.daggertest.mainactivity.di

import android.arch.lifecycle.ViewModel
import br.com.iacovelli.daggertest.mainactivity.MainService
import br.com.iacovelli.daggertest.mainactivity.MainViewModel
import br.com.iacovelli.daggertest.mainactivity.Repository
import br.com.iacovelli.daggertest.mainactivity.RepositoryImpl
import com.iacovelli.core.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import retrofit2.Retrofit

@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun provideViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    abstract fun provideRepository(repository: RepositoryImpl): Repository

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideService(retrofit: Retrofit): MainService = retrofit.create(MainService::class.java)
    }
}