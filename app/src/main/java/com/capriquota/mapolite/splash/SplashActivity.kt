package com.capriquota.mapolite.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.capriquota.mapolite.R
import com.capriquota.mapolite.slides.SlideActivity

class SplashActivity : AppCompatActivity() {
    private val counter: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        Handler().postDelayed({
            startActivity(Intent(this, SlideActivity::class.java))
            finish()
        },counter)
    }
}
