package com.example.optionsmenutablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.optionsmenutablayout.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernamee = intent.getStringExtra(LoginFragment.EXTRA_USERNAME)

        with(binding) {
            getUsernameee.text = usernamee

            btnNavigationBefore.setOnClickListener {
                val intentNavigation = Intent(LoginActivity(), LoginFragment::class.java)
                startActivity(intentNavigation)
            }
        }
    }
}
