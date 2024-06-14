package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivityLoginBinding
import com.akirachix.mentorconnect.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.textView5.setOnClickListener {
            finish()
        }
        binding.btnLogin.setOnClickListener {
            validateRegistration()
        }


    }
    fun validateRegistration() {
        clearErrors()
        var formError = false
        val userName = binding.etUsername.text.toString()
        if (userName.isBlank()) {
            formError = true
            binding.tilUsername.error = getString(R.string.username_is_required)
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        if (formError != true){

        }
    }
    fun clearErrors() {
        binding.tilUsername.error = null
        binding.tilPassword.error = null
    }
}