package com.laoluo.fastdevcore.integration.http

import okhttp3.HttpUrl

interface BaseUrl {
    fun url(): HttpUrl?
}