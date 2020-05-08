package com.laoluo.fastdevcore.integration.http.response

import com.laoluo.fastdevcore.integration.http.ServerException
import com.laoluo.fastdevcore.integration.http.response.entity.BaseResponseBean
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.ObservableTransformer

class ResponseTransformer<T> :ObservableTransformer<BaseResponseBean<T>,T>{

    override fun apply(upstream: Observable<BaseResponseBean<T>>): ObservableSource<T> {
        return upstream.flatMap { t ->
            if (t.success) {
                Observable.just(t.data)
            }else{
                Observable.error(ServerException(t.message, t.code))
            }
        }
    }
}