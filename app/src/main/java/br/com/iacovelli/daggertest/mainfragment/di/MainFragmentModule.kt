package br.com.iacovelli.daggertest.mainfragment.di

import br.com.iacovelli.daggertest.mainfragment.FragmentViewModel
import br.com.iacovelli.daggertest.mainfragment.FragmentViewModelImpl
import br.com.iacovelli.daggertest.mainfragment.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModule {

    @Binds
    abstract fun provideViewModel(viewModel: FragmentViewModelImpl): FragmentViewModel
}