package com.example.projectmpti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnTambah: Button
    private lateinit var btnLihat: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menginisialisasi tombol
        btnTambah = findViewById(R.id.btnTambah)
        btnLihat = findViewById(R.id.btnLihat)

        // Menambahkan listener untuk tombol tambah
        btnTambah.setOnClickListener {
            // Aksi yang diinginkan saat tombol tambah ditekan
            val intent = Intent(this@MainActivity, TambahActivity::class.java)
            startActivity(intent)
        }

        // Menambahkan listener untuk tombol lihat
        btnLihat.setOnClickListener {
            // Aksi yang diinginkan saat tombol lihat ditekan
            val intent = Intent(this@MainActivity, DataActivity::class.java)
            startActivity(intent)
        }
    }
}
