package com.openlab.laacademia.ui.splash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.openlab.laacademia.R
import com.openlab.laacademia.ui.login.LoginActivity
import com.openlab.laacademia.util.ActivityUtils.Companion.nextActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread {
            Thread.sleep(1000)
            nextActivity(this, LoginActivity::class.java,true)
        }.start()

    }
}