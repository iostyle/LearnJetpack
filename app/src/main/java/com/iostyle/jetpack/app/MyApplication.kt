package com.iostyle.jetpack.app

import android.app.Application
import com.iostyle.jetpack.R
import com.simple.spiderman.SpiderMan

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SpiderMan.init(this).setTheme(R.style.SpiderManTheme_Light)
    }
}