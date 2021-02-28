package com.example.friendlyshare.di.modules

import com.example.friendlyshare.di.scopes.PartiesScope
import com.example.friendlyshare.models.interactors.PartiesInteractor
import com.example.friendlyshare.models.repositories.PartiesRepository
import dagger.Module
import dagger.Provides

@Module
class PartiesModule {

    @Provides
    @PartiesScope
    fun provideInteractor(repository: PartiesRepository) = PartiesInteractor(repository)

    @Provides
    @PartiesScope
    fun provideRepository() = PartiesRepository()
}