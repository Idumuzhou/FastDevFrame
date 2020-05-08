package com.laoluo.fastdevcore.integration.http.utl


interface IRetrofitUrlManagerService {
    fun putDomain(domainName:String, domainUrl: String)
    fun addUrlParserListener(domainName: String, listener: OnUrlParserListener)
    fun removeUrlParserListener(domainName: String)
}