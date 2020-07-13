package com.capriquota.mapolite.slides

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.capriquota.mapolite.home.HomeActivity
import com.capriquota.mapolite.util.PrefManager
import com.github.paolorotolo.appintro.AppIntro

class SlideActivity : AppIntro() {
    private var prefManager: PrefManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        prefManager = PrefManager(this)

        if (prefManager!!.getIntro().equals("qudus")) {
            val intent = Intent(this@SlideActivity, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this.finish()
        }

        addSlide(FragmentSlide1())  //extend AppIntro and comment setContentView
        addSlide(FragmentSlide2())
        addSlide(FragmentSlide3())
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)

        prefManager!!.putIntro("qudus")

        val intent = Intent(this@SlideActivity, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        this.finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)

        prefManager!!.putIntro("qudus")

        val intent = Intent(this@SlideActivity, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        this.finish()
    }

    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
        setSlideOverAnimation()
    }

}
