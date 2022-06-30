package com.example.synnefo.di.model

import android.content.Context
import androidx.room.Room
import com.example.shoppingtest.data.local.SynnefoDao
import com.example.shoppingtest.data.local.SynnefoDatabase
import com.example.synnefo.data.remote.SynnefoApi
import com.example.synnefo.repository.DefaultRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context,
    )= Room.databaseBuilder(context,SynnefoDatabase::class.java,"synnefo_Db").build()


    @Singleton
    @Provides
    fun provideShoppingDao(
        database: SynnefoDatabase
    )=database.synnedoDao()


    @Provides
    @Singleton
    fun provideApi():SynnefoApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://xxxxx.com/")
            .build()
            .create(SynnefoApi::class.java)
    }


    @Singleton
    @Provides
    fun provideRepository(
       synnefoDao: SynnefoDao,
        synnefoApi: SynnefoApi
    ): DefaultRepository {
        return DefaultRepository(synnefoApi,synnefoDao)
    }

}