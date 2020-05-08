package com.laoluo.fastdevcore.utils

import com.laoluo.fastdevcore.base.delegate.AppDelegate
import org.kodein.di.KodeinAware

fun Any.obtainAppKodeinAware(): KodeinAware {
    return (AppDelegate.instance)
}