package com.eugene.tinderclone.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.eugene.tinderclone.R
import com.eugene.tinderclone.databinding.ActivityStartupBinding


class StartupActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartupBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onLogin(binding.loginButton)
    }

    fun onLogin(v: View) {
//        v.setOnClickListener()


    }

    fun onSignup(v: View) {

    }

}
