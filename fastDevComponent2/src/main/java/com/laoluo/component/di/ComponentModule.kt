package com.laoluo.component.di

import android.app.Application
import com.laoluo.component.core.ComponentConfig
import com.laoluo.fastdev.aretrofit.ARetrofit
import com.laoluo.fastdev.aroutercalladapter.RxARouterCallAdapterFactory
import org.kodein.di.Kodein
import org.kodein.di.generic.*

private const val MODEL_MODULE_TAG = "ComponentModule"

val componentModule = Kodein.Module(MODEL_MODULE_TAG) {

    bind<ARetrofit.Builder>() with provider {
        ARetrofit.Builder()
    }

    bind<ARetrofit>() with singleton {
        instance<ARetrofit.Builder>()
            .apply {
                val componentConfig = instance<ComponentConfig>()
                componentConfig.provideARetrofitConfiguration()
                    ?.configARetrofit(instance<Application>(), this)
                addCallAdapterFactory(RxARouterCallAdapterFactory.create())
            }
            .build()
    }

    bind<ComponentConfig>() with singleton {
        instanceOrNull<ComponentConfig.Builder>()?.build() ?: ComponentConfig.Builder().build()
    }
}