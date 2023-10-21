package com.example.optionsmenutablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.optionsmenutablayout.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private val usernameMasuk = "Aisa"
    private val passwordMasuk = "492559"
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        with(binding) {
            loginBtn.setOnClickListener {
                val Username2 = username.text.toString()
                val Password2 = pass.text.toString()

                if (Username2 == usernameMasuk && Password2 == passwordMasuk) {
                    val intentLoginActivity= Intent(requireActivity(), LoginActivity::class.java)
                    intentLoginActivity.putExtra(LoginFragment.EXTRA_USERNAME, Username2)
                    startActivity(intentLoginActivity)
                    Toast.makeText(requireContext(), "Login Success", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(requireContext(), "Login Failed", Toast.LENGTH_SHORT).show()
                }
            }

        }
        return view
    }

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }
}