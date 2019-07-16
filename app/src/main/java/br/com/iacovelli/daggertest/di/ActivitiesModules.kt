package br.com.iacovelli.daggertest.di

import br.com.iacovelli.daggertest.detailactivity.DetailActivity
import br.com.iacovelli.daggertest.detailactivity.di.DetailActivityModule
import br.com.iacovelli.daggertest.mainactivity.MainActivity
import br.com.iacovelli.daggertest.mainactivity.di.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [DetailActivityModule::class])
    abstract fun provideDetailActivity(): DetailActivity

}