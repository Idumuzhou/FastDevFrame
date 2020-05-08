package com.laoluo.fastdevcore.integration.http.utl

import okhttp3.HttpUrl

interface OnUrlParserListener {
    fun parseUrl(domainUrl: HttpUrl?, url: HttpUrl): HttpUrl?
}