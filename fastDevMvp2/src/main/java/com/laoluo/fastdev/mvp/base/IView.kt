package com.laoluo.fastdev.mvp.base


interface IView {
    fun onError(code:Int,msg:String)
    fun finishActivity()
}