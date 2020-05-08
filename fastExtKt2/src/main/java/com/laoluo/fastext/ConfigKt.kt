package com.laoluo.fastext

inline fun <reified T> quickConfig(init:T.()->Unit):T{
    val instance = T::class.java.newInstance()
    instance.init()
    return instance
}