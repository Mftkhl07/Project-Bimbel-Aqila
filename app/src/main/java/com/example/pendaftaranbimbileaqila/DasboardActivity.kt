package com.example.pendaftaranbimbileaqila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DasboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard)

        val btnlogout= findViewById<Button>(R.id.logoutButton)

        btnlogout.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            val pesan = "Berhasil Logout"

            Toast.makeText(this," $pesan",Toast.LENGTH_SHORT).show()
        }
    }
}