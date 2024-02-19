package org.manifest.manifest24.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.manifest.manifest24.data.repositories.GasStationRepository
import org.manifest.manifest24.data.repositories.IGasStationRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class GasStationModule {
    @Binds
    @Singleton
    abstract fun bindGasStationRepository(
        gasStationRepository: GasStationRepository
    ): IGasStationRepository
}
