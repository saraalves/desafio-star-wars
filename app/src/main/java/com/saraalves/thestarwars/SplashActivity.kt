package com.saraalves.thestarwars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window.FEATURE_NO_TITLE
import androidx.core.content.ContextCompat
import com.saraalves.thestarwars.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(FEATURE_NO_TITLE)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.gray_01)
    }

    fun animaImagem() {
        binding.imgSplash.alpha = 0f
        binding.imgSplash.y = 900f

        binding.imgSplash.animate()
            .alpha(1f)
            .y(250f)
            .setDuration(2000)
            .setListener(null)
    }
}