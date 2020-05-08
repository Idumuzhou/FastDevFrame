package com.laoluo.fastdevcore.integration.http.response

import com.laoluo.fastdevcore.integration.http.response.entity.ResponseBean
import io.reactivex.ObservableTransformer

class ResponseTransformerStrategyImpl :
    ResponseTransformerStrategy {
    override fun <T> provideObservableTransformer(): ObservableTransformer<ResponseBean<T>, T> {
        return ResponseTransformer<T>() as ObservableTransformer<ResponseBean<T>, T>
    }
}