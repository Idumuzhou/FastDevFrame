package com.laoluo.fastdevcore.integration.http.response

import com.laoluo.fastdevcore.integration.http.response.entity.ResponseBean
import io.reactivex.ObservableTransformer

interface ResponseTransformerStrategy{
    fun <T> provideObservableTransformer():ObservableTransformer<ResponseBean<T>,T>
}