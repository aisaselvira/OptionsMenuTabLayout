package com.example.optionsmenutablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.optionsmenutablayout.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username1 = intent.getStringExtra(RegisterFragment.EXTRA_USERNAME)
        val email1 = intent.getStringExtra(RegisterFragment.EXTRA_EMAIL)
        val phone1 = intent.getStringExtra(RegisterFragment.EXTRA_PHONE)
        with(binding) {
            username.text = username1
            email.text = email1
            phone.text = phone1

            btnNavigationBefore.setOnClickListener {
                val intentNavigation = Intent(RegisterActivity(), RegisterFragment::class.java)
                startActivity(intentNavigation)
            }
        }
    }
}