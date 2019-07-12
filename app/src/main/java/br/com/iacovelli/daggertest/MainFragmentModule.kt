package br.com.iacovelli.daggertest

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModule {

    @Binds
    abstract fun provideViewModel(viewModel: FragmentViewModelImpl): FragmentViewModel
}