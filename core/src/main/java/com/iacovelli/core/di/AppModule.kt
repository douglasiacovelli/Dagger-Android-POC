package com.iacovelli.core.di

import com.iacovelli.core.BuildConfig
import com.iacovelli.core.Constants
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
        return Constants.BASE_URL
    }

    @Provides
    @Singleton
    @Named("isDebuggable")
    fun provideIsDebuggable() = BuildConfig.DEBUG

}