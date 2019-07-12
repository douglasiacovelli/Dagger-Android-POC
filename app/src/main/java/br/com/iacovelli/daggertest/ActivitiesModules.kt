package br.com.iacovelli.daggertest

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModules {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivity(): MainActivity

}