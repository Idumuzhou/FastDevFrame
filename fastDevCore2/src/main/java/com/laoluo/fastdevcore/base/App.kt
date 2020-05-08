package com.laoluo.fastdevcore.base

import com.laoluo.fastdevcore.di.controller.AppController


interface App {
    fun getAppController(): AppController
}