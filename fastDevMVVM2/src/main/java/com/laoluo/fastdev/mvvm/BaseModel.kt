package com.laoluo.fastdev.mvvm

import com.laoluo.fastdevcore.utils.obtainAppKodeinAware
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

open class BaseModel : KodeinAware {
    override val kodein: Kodein = obtainAppKodeinAware().kodein

}