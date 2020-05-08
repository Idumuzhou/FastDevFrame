package com.laoluo.component.core

import android.app.Application
import android.content.Context
import com.laoluo.component.di.componentModule
import com.laoluo.fastdevcore.base.delegate.AppLifecycle
import com.laoluo.fastdevcore.di.module.GlobalConfigModule
import com.laoluo.fastdevcore.integration.ConfigModule
import org.kodein.di.Kodein

class ComponentConfigModule: ConfigModule {
    override fun applyOptions(context: Context, builder: GlobalConfigModule.Builder) {
    }

    override fun injectAppLifecycle(context: Context, lifecycles: ArrayList<AppLifecycle>) {
        lifecycles.add(AppLifecycleImpl())
    }

    override fun injectActivityLifecycle(
        context: Context,
        lifecycles: ArrayList<Application.ActivityLifecycleCallbacks>
    ) {
        lifecycles.add(ActivityLifecycleCallbacksImpl())
    }

    override fun injectKoDeinModule(context: Context, kodeinModules: ArrayList<Kodein.Module>) {
        kodeinModules.add(componentModule)
    }

    override val priority= Int.MIN_VALUE
}