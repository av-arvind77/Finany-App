package dev.arvind.demo

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import dev.arvind.demo.utils.isNight


class FinanyApp: Application() {

    override fun onCreate() {
        super.onCreate()

        // Get UI mode and set
        val mode  = if (isNight()) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }

        AppCompatDelegate.setDefaultNightMode(mode)
    }
}