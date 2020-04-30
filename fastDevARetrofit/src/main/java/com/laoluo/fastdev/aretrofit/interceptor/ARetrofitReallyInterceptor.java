package com.laoluo.fastdev.aretrofit.interceptor;

import com.laoluo.fastdev.aretrofit.Request;
import com.laoluo.fastdev.aretrofit.RouterInfo;

public class ARetrofitReallyInterceptor implements ARetrofitInterceptor {
    @Override
    public RouterInfo intercept(Chain chain, Request request) {
        return chain.call(request);
    }
}
