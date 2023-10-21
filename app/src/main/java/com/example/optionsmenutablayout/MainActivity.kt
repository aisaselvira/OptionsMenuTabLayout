package com.example.optionsmenutablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.optionsmenutablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            viewPager.adapter = Tab_Adapter(supportFragmentManager)
            // Hubungkan ViewPager dengan TabLayout
            tabLayout.setupWithViewPager(viewPager)
        }
    }
}