package com.laoluo.fastdev.mvp.base

import org.kodein.di.Kodein

interface KodeinModuleProvider {
    fun providerModule(): Kodein.Module
}