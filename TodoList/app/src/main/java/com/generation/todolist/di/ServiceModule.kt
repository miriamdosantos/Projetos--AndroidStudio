package com.generation.todolist.di

import com.generation.todolist.api.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModel {

    @Singleton
    @Provides
    fun returnRepository(): Repository {

        return Repository()

    }




}