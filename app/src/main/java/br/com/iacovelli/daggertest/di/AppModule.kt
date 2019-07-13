package br.com.iacovelli.daggertest.di

import br.com.iacovelli.daggertest.BuildConfig
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    @Named("baseUrl")
    fun provideBaseUrl(): String {
        return "http://mydomain.com/api/"
    }

    @Provides
    @Singleton
    @Named("isDebuggable")
    fun provideIsDebuggable() = BuildConfig.DEBUG

}