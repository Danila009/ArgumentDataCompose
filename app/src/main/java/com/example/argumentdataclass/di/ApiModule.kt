package com.example.argumentdataclass.di

import com.example.argumentdataclass.api.AutorApi
import com.example.argumentdataclass.api.Repository
import com.example.argumentdataclass.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Singleton
    @Provides
    fun providerApiAutor(
        autorApi: AutorApi
    ) = Repository(autorApi)

    @Singleton
    @Provides
    fun providerRetrofitAutor() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(AutorApi::class.java)
}