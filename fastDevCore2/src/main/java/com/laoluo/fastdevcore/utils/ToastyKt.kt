package com.laoluo.fastdevcore.utils

import android.app.Application
import es.dmoral.toasty.Toasty
import org.kodein.di.generic.instance

fun String.toasty(duration:Int=Toasty.LENGTH_LONG){
    val context by obtainAppKodeinAware().instance<Application>()
    Toasty.normal(context,this,duration).show()
}