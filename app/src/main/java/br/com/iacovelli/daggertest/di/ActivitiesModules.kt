package br.com.iacovelli.daggertest.di

import br.com.iacovelli.daggertest.mainactivity.MainActivity
import br.com.iacovelli.daggertest.mainactivity.di.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivity(): MainActivity

}