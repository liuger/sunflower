package com.liu.sunflower

import android.app.Application
import androidx.work.Configuration
import androidx.work.WorkManagerInitializer
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application(), Configuration.Provider {
    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setMinimumLoggingLevel(if (BuildConfig.DEBUG) android.util.Log.DEBUG else android.util.Log.ERROR)
            .build()
    }
}