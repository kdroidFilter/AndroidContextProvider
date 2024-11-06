package com.kdroid.androidcontextprovider

import android.content.Context
import android.util.Log

object ContextProvider {
    private var isInitialized = false
    private lateinit var appContext: Context

    fun initialize(context: Context) {
        if (isInitialized) {
            return
        }
        appContext = context.applicationContext
        Log.d("ContextProvider", "ContextProvider initialized with context: $appContext")
        isInitialized = true
    }

    fun getContext(): Context {
        if (!isInitialized) {
            throw IllegalStateException("ContextProvider has not been initialized. Make sure it is initialized before calling getContext()")
        }
        return appContext
    }
}