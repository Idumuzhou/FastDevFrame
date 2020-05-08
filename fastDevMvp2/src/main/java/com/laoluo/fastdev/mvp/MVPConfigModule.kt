package com.laoluo.fastdev.mvp

import android.app.Application
import android.content.Context
import com.laoluo.fastdevcore.base.delegate.AppLifecycle
import com.laoluo.fastdevcore.di.module.GlobalConfigModule
import com.laoluo.fastdevcore.integration.ConfigModule
import org.kodein.di.Kodein

class MVPConfigModule: ConfigModule {
    override val priority: Int = ConfigModule.LIB_MODULE

    override fun applyOptions(context: Context, builder: GlobalConfigModule.Builder) {
    }

    override fun injectActivityLifecycle(context: Context, lifecycles: ArrayList<Application.ActivityLifecycleCallbacks>) {
        lifecycles.add(ActivityLifecycleImpl())
    }

    override fun injectAppLifecycle(context: Context, lifecycles: ArrayList<AppLifecycle>) {

    }

    override fun injectKoDeinModule(context: Context, kodeinModules: ArrayList<Kodein.Module>) {
    }
}