package com.laoluo.fastdevcore.base

import android.content.ContentProvider
import android.content.ContentValues
import android.content.ContextWrapper
import android.database.Cursor
import android.net.Uri
import com.laoluo.fastdevcore.base.delegate.AppDelegate

class QuickCoreInitFirstProvider: ContentProvider() {
    override fun onCreate(): Boolean {
        context?.apply  context@{
            AppDelegate.instance
                    .init(this)
                    .apply {
                        attachBaseContext((this@context as ContextWrapper).baseContext)
                    }
        }
        return true
    }

    override fun insert(uri: Uri?, values: ContentValues?): Uri? {
        return null
    }

    override fun query(uri: Uri?, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor? {
        return null
    }

    override fun update(uri: Uri?, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?) = 0

    override fun delete(uri: Uri?, selection: String?, selectionArgs: Array<out String>?): Int  = 0

    override fun getType(uri: Uri?): String?  = null
}