package com.laoluo.imageloader

import android.app.Application
import android.content.Context
import com.laoluo.fastdevcore.base.delegate.AppLifecycle
import com.laoluo.fastdevcore.di.module.GlobalConfigModule
import com.laoluo.fastdevcore.integration.ConfigModule
import org.kodein.di.Kodein

class GlideConfigModule: ConfigModule {
    override fun applyOptions(context: Context, builder: GlobalConfigModule.Builder) {

    }

    override fun injectAppLifecycle(context: Context, lifecycles: ArrayList<AppLifecycle>) {
    }

    override fun injectActivityLifecycle(context: Context, lifecycles: ArrayList<Application.ActivityLifecycleCallbacks>) {
    }

    override fun injectKoDeinModule(context: Context, kodeinModules: ArrayList<Kodein.Module>) {
        kodeinModules.add(glideKodeinModule)
    }

    override val priority = Int.MAX_VALUE
}