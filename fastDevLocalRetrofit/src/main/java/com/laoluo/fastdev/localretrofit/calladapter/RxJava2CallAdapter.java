package com.laoluo.fastdev.localretrofit.calladapter;

import com.laoluo.fastdev.localretrofit.Call;
import com.laoluo.fastdev.localretrofit.CallAdapter;
import com.laoluo.fastdev.localretrofit.Response;

import java.lang.reflect.Type;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;

final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final Type responseType;
    private final boolean isBody;
    private final boolean isFlowable;
    private final boolean isSingle;
    private final boolean isMaybe;
    private final boolean isCompletable;

    RxJava2CallAdapter(Type responseType, boolean isBody, boolean isFlowable, boolean isSingle, boolean isMaybe,
                       boolean isCompletable) {
        this.responseType = responseType;
        this.isBody = isBody;
        this.isFlowable = isFlowable;
        this.isSingle = isSingle;
        this.isMaybe = isMaybe;
        this.isCompletable = isCompletable;
    }

    @Override
    public Type responseType() {
        return responseType;
    }

    @Override
    public Object adapt(Call<R> call) {
        Observable<Response<R>> responseObservable = new CallExecuteObservable<>(call);
        Observable<?> observable;
        if (isBody) {
            observable = new BodyObservable<>(responseObservable);
        } else {
            observable = responseObservable;
        }
        if (isFlowable) {
            return observable.toFlowable(BackpressureStrategy.LATEST);
        }
        if (isSingle) {
            return observable.singleOrError();
        }
        if (isMaybe) {
            return observable.singleElement();
        }
        if (isCompletable) {
            return observable.ignoreElements();
        }
        return observable;
    }
}
