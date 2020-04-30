package com.laoluo.fastdev.aretrofit;

public interface Call<T> {
    Response<T> execute();
    Call<T> clone();
}
