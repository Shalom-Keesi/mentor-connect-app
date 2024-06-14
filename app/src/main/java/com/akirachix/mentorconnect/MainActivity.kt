package com.akirachix.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView2.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }

    }

    fun validateRegistration() {
        clearErrors()
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilFirstName.error = getString(R.string.first_name_is_required)
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()) {
            formError = true
            binding.tilLastName.error = getString(R.string.last_name_is_required)
        }
        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formError = true
            binding.tilEmail.error = getString(R.string.email_is_required)
        }
        val codehiveId = binding.etCodehiveID.text.toString()
        if (codehiveId.isBlank()) {
            formError = true
            binding.tilCodehiveID.error = getString(R.string.codehive_id_is_required)
        }
        val username = binding.etUsername.text.toString()
        if (username.isBlank()) {
            formError = true
            binding.tilUsername.error = getString(R.string.username_is_required)
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        val passwordConf = binding.etConfirmPassword.text.toString()
        if (passwordConf.isBlank()) {
            formError = true
            binding.tilConfirmPassword.error = getString(R.string.password_confirmation_is_required)
        }
        if (password != passwordConf) {
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_password_confirmation_do_not_match)
        }
        if (formError != true){

        }
    }

    fun clearErrors(){
        binding.tilFirstName.error=null
        binding.tilLastName.error=null
        binding.tilEmail.error=null
        binding.tilCodehiveID.error=null
        binding.tilUsername.error=null
        binding.tilPassword.error=null
        binding.tilConfirmPassword.error=null

    }
}