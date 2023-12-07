package com.example.pendaftaranbimbileaqila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

import com.example.pendaftaranbimbileaqila.databinding.ActivityLoginBinding
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.Observable

@SuppressLint( "CheckResult")
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameStream = RxTextView.textChanges(binding.etEmail)
            .skipInitialValue()
            .map { name ->
                name.isEmpty()
            }
        nameStream.subscribe {
            showNameExistAlert(it)
        }

        val password = RxTextView.textChanges(binding.etPassword)
            .skipInitialValue()
            .map { password ->
                password.isEmpty()
            }
        password.subscribe {
            showPasswordExistAlert(it)
        }

        val invalidFieldsStream = Observable.combineLatest(
            nameStream,
            password,
            { nameStream: Boolean, password: Boolean ->
                !nameStream && !password
            })
        invalidFieldsStream.subscribe { isValid ->
            if (isValid) {
                binding.btnLogin.isEnabled = true
                binding.btnLogin.backgroundTintList = ContextCompat.getColorStateList(this,  R.color.primary_color)
            } else{
                binding.btnLogin.isEnabled = false
                binding.btnLogin.backgroundTintList  =  ContextCompat.getColorStateList(this, android.R.color.darker_gray)

            }
        }

                binding.btnLogin.setOnClickListener {
                    startActivity(Intent(this, DasboardActivity::class.java))
                }
            binding.tvHaventAccount.setOnClickListener {
                startActivity(Intent(this, RegisterActyvity::class.java))
            }
        }
        private fun showNameExistAlert(isNotValid: Boolean) {
            binding.etEmail.error = if (isNotValid) "Nama tidak boleh kosong" else null
        }

        private fun showPasswordExistAlert(isNotValid: Boolean) {
            binding.etPassword.error = if (isNotValid) "Password tidak boleh kosong" else null
        }
    }

