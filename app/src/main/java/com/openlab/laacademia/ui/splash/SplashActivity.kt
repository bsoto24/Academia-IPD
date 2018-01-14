package com.openlab.laacademia.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.openlab.laacademia.R
import com.openlab.laacademia.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Thread {
            Thread.sleep(1000);
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }.start()

    }
}