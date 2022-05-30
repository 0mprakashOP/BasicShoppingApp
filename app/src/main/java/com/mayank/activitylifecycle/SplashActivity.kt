package com.mayank.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({

            val intent9=Intent(this@SplashActivity,LoginActivity::class.java)
            startActivity(intent9)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        } ,2000)

    }
}