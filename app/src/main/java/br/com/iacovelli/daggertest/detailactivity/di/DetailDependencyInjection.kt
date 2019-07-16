package br.com.iacovelli.daggertest.detailactivity.di

import br.com.iacovelli.daggertest.detailactivity.DetailActivity
import br.com.iacovelli.daggertest.detailactivity.Repository
import br.com.iacovelli.daggertest.detailactivity.RepositoryImpl
import br.com.iacovelli.daggertest.di.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class DetailActivityModule {

    @Provides
    @ActivityScope
    fun provideRepository(repository: RepositoryImpl): Repository = repository

    @ActivityScope
    @Provides
    @Named("age")
    fun provideAge(activity: DetailActivity): Int {
        return activity.age
    }

}