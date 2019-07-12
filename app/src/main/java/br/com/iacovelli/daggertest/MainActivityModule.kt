package br.com.iacovelli.daggertest

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun provideViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun provideRepository(repository: RepositoryImpl): Repository
}