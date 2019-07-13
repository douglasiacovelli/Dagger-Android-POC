package br.com.iacovelli.daggertest.di

import br.com.iacovelli.daggertest.mainfragment.MainFragment
import br.com.iacovelli.daggertest.mainfragment.di.MainFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun provideMainFragment(): MainFragment
}