package com.laoluo.component.utils

import com.laoluo.fastdev.aretrofit.ARetrofit
import com.laoluo.fastdevcore.utils.obtainAppKodeinAware
import org.kodein.di.generic.instance

object ComponentKodeInKt {
    val KARetrofit by obtainAppKodeinAware().instance<ARetrofit>()
}