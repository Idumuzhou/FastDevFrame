package com.laoluo.fastdev.aretrofit;

public interface RawCall {
    Request execute();
    interface Factory {
        RawCall newCall(Request request);
    }
}
