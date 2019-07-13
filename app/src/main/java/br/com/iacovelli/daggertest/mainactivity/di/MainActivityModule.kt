package br.com.iacovelli.daggertest.mainactivity.di

import br.com.iacovelli.daggertest.mainactivity.MainViewModel
import br.com.iacovelli.daggertest.mainactivity.Repository
import br.com.iacovelli.daggertest.mainactivity.RepositoryImpl
import br.com.iacovelli.daggertest.mainactivity.ViewModel
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun provideViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    abstract fun provideRepository(repository: RepositoryImpl): Repository
}