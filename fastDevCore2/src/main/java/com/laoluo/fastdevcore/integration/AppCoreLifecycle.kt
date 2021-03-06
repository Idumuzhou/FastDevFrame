package com.laoluo.fastdevcore.integration

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import com.laoluo.fastdevcore.base.delegate.AppLifecycle
import com.laoluo.fastdevcore.integration.http.utl.DefaultUrlParserEx
import es.dmoral.toasty.Toasty
import me.jessyan.retrofiturlmanager.RetrofitUrlManager

class AppCoreLifecycle: AppLifecycle {
    override fun attachBaseContext(base: Context) {
    }

    override fun onCreate(application: Application) {
        DefaultUrlParserEx().apply {
            this.init(RetrofitUrlManager.getInstance())
            RetrofitUrlManager.getInstance().setUrlParser(this)
        }
        Toasty.Config.getInstance().allowQueue(false).apply()
    }

    override fun onLowMemory() {
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
    }

    override fun onTrimMemory(level: Int) {
    }
}