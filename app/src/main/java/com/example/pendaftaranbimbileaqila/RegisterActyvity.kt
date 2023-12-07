package com.example.pendaftaranbimbileaqila


import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class RegisterActyvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_actyvity)


            val jeniskelamin = listOf("Laki-laki", "Perempuan")
            val autoComplete: AutoCompleteTextView = findViewById(R.id.jenis_kelamin)
            val adapter = ArrayAdapter(this, R.layout.list_item, jeniskelamin)

            autoComplete.setAdapter(adapter)

            autoComplete.onItemClickListener =
                AdapterView.OnItemClickListener { adapterView, view, i, l ->

                    val Kelas = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
                    val autoComplete: AutoCompleteTextView = findViewById(R.id.Kelas)
                    val adapter = ArrayAdapter(this, R.layout.list_item, Kelas)

                    autoComplete.setAdapter(adapter)

                    autoComplete.onItemClickListener =
                        AdapterView.OnItemClickListener { adapterView, view, i, l ->

                            val Mapel = listOf("Semua Mapel", "Bahasa Inggris")
                            val autoComplete: AutoCompleteTextView = findViewById(R.id.Mapel)
                            val adapter = ArrayAdapter(this, R.layout.list_item, Mapel)

                            autoComplete.setAdapter(adapter)

                            autoComplete.onItemClickListener =
                                AdapterView.OnItemClickListener { adapterView, view, i, l ->

                                    val Program = listOf("Privat", "Reguler")
                                    val autoComplete: AutoCompleteTextView =
                                        findViewById(R.id.program)
                                    val adapter = ArrayAdapter(this, R.layout.list_item, Program)

                                    autoComplete.setAdapter(adapter)

                                    autoComplete.onItemClickListener =
                                        AdapterView.OnItemClickListener { adapterView, view, i, l ->


                                            val Hari = listOf(
                                                "Senin",
                                                "Selasa",
                                                "Rabu",
                                                "Kamis",
                                                "Jumat",
                                                "Sabtu"
                                            )
                                            val autoComplete: AutoCompleteTextView =
                                                findViewById(R.id.Hari)
                                            val adapter =
                                                ArrayAdapter(this, R.layout.list_item, Hari)

                                            autoComplete.setAdapter(adapter)

                                            autoComplete.onItemClickListener =
                                                AdapterView.OnItemClickListener { adapterView, view, i, l ->


                                                    val jam = listOf("15:00-16:30", "16:30-18:00", "18:30-20:00")
                                                    val autoComplete: AutoCompleteTextView =
                                                        findViewById(R.id.jam)
                                                    val adapter =
                                                        ArrayAdapter(this, R.layout.list_item, jam)

                                                    autoComplete.setAdapter(adapter)

                                                    autoComplete.onItemClickListener =
                                                        AdapterView.OnItemClickListener { adapterView, view, i, l ->

                                                            val btnnext = findViewById<Button>(R.id.tv_havent_account)
                                                            btnnext.setOnClickListener {
                                                                val intent = Intent(this, DataActivity::class.java)
                                                                startActivity(intent)
                                                        }

                                                }
                                        }
                                }
                        }
                }
        }
    }
    }
