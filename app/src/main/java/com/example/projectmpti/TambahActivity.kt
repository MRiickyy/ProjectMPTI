package com.example.projectmpti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.projectmpti.DatabaseHelper

class TambahActivity : AppCompatActivity() {
    private lateinit var dbHelper: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        dbHelper = DatabaseHelper(this)
        val nama = findViewById<EditText>(R.id.nama)
        val password = findViewById<EditText>(R.id.password)
        val btnTambah : Button = findViewById(R.id.tambah)
        btnTambah.setOnClickListener {
            val namaText = nama.text.toString()
            val passwordText = password.text.toString()
            dbHelper.insertAccount(namaText, passwordText)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}