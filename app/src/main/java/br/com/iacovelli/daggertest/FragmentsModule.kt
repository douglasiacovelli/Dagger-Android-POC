package br.com.iacovelli.daggertest

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun provideMainFragment(): MainFragment

}