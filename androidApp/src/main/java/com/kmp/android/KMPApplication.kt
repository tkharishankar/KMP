package com.kmp.android

import android.app.Application
import com.kmp.android.di.appModule
import com.kmp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
class KMPApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@KMPApplication)
            modules(appModule)
        }
    }
}