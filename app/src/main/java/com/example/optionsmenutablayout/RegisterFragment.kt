package com.example.optionsmenutablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.optionsmenutablayout.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root

        with(binding) {
            regisBtn.setOnClickListener {
                val intentRegisterActivity = Intent(requireActivity(), RegisterActivity::class.java)
                intentRegisterActivity.putExtra(EXTRA_USERNAME, username.text.toString())
                intentRegisterActivity.putExtra(EXTRA_EMAIL, email.text.toString())
                intentRegisterActivity.putExtra(EXTRA_PHONE, phone.text.toString())
                intentRegisterActivity.putExtra(EXTRA_PASSWORD, pass.text.toString())
                startActivity(intentRegisterActivity)
            }

            loginText.setOnClickListener {
                val intentLoginFragment = Intent(requireActivity(), LoginFragment::class.java)
                startActivity(intentLoginFragment)
            }

        }

        return view
    }

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }
}