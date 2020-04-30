package com.laoluo.fastdev.aretrofit.interceptor;

import com.laoluo.fastdev.aretrofit.Request;
import com.laoluo.fastdev.aretrofit.RouterInfo;

import java.util.List;

public class ARetrofitReallyInterceptorChain implements ARetrofitInterceptor.Chain {
    private List<ARetrofitInterceptor> interceptors;
    private int index;

    public ARetrofitReallyInterceptorChain(List<ARetrofitInterceptor> interceptors, int index) {
        this.interceptors = interceptors;
        this.index = index;
    }

    @Override
    public RouterInfo proceed(Request request) {
        if (index >= interceptors.size()) throw new AssertionError("index >= interceptors.size()");
        ARetrofitInterceptor.Chain reallyInterceptorChain = new ARetrofitReallyInterceptorChain(interceptors, index + 1);
        ARetrofitInterceptor interceptor = interceptors.get(index);
        return interceptor.intercept(reallyInterceptorChain, request);
    }

    @Override
    public RouterInfo call(Request request) {
        RouterInfo routerInfo = new RouterInfo();
        routerInfo.setRelativeUrl(request.getRelativeUrl());
        routerInfo.setFlags(request.getFlags());
        routerInfo.setBundle(request.getExtras());
        routerInfo.setGreenChannel(request.isGreenChannel());
        routerInfo.setContextWeakReference(request.getContextWeakReference());
        return routerInfo;
    }
}
