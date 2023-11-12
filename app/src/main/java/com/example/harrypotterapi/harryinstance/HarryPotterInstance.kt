package com.example.harrypotterapi.harryinstance

import com.example.harrypotterapi.RetrofitConstant.BASE_URL
import com.example.harrypotterapi.harryinterface.HarryPotterInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

//private const val BASE_URL = "https://hp-api.onrender.com/api/"

@Module
@InstallIn(SingletonComponent::class)
object HarryPotterInstance {

    @Provides
    @Singleton
    fun provideRetrofit() : HarryPotterInterface{

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HarryPotterInterface::class.java)
    }


}