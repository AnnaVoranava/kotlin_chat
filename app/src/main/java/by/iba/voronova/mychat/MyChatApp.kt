package by.iba.voronova.mychat

import android.app.Application
import timber.log.Timber
import timber.log.Timber.DebugTree

class MyChatApp: Application() {
    override fun onCreate() {
        super.onCreate()
       if(BuildConfig.DEBUG) {
           Timber.plant(DebugTree())
       }
    }
}