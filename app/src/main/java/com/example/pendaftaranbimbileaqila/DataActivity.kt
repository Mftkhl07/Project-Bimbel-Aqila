package com.example.pendaftaranbimbileaqila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        val btndaftar = findViewById<Button>(R.id.btn_register)

        btndaftar.setOnClickListener {
            val intent = Intent(this, DasboardActivity::class.java)
            startActivity(intent)

            val message = "Pendaftaran Berhasil"

            Toast.makeText(this," $message", Toast.LENGTH_SHORT).show()

        }
    }


}
