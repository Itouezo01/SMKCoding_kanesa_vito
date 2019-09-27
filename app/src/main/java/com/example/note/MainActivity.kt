package com.example.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab!!.setOnClickListener { fab() }
    }

    fun fab() {
        val i = Intent(this, activity_coba_activity::class.java)
        startActivity(i)
    }

    fun ic_input_add(view: View) {}

    val tugas = intent.getStringExtra("Tugas")
    val tanggal = intent.getStringExtra("Tanggal")
    // set text data yang diterima di textview
    text_penerima_tugas.text = Tugas
    text_penerima_tanggal.text = Tanggal

}
