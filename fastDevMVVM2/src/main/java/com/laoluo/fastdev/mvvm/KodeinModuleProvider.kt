package com.laoluo.fastdev.mvvm

import org.kodein.di.Kodein

interface KodeinModuleProvider {
    fun providerModule(): Kodein.Module
}