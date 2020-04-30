package com.laoluo.fastdev.aretrofit.interceptor;

import com.laoluo.fastdev.aretrofit.Request;
import com.laoluo.fastdev.aretrofit.RouterInfo;

public interface ARetrofitInterceptor {
    RouterInfo intercept(Chain chain, Request request);

    interface Chain {
        RouterInfo proceed(Request request);

        RouterInfo call(Request request);
    }
}
