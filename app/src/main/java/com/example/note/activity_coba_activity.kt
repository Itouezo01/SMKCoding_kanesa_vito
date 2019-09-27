package com.example.note

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coba_activity.*
import kotlinx.android.synthetic.main.activity_main.*

class activity_coba_activity : AppCompatActivity() {
private var mwork : TextView?=null
    private var mtanggal : TextView?=null
    private var kirim : Button?=null

    override fun onCreate(savedInstanonState: Bundle?) {
        super.onCreate(savedInstanonState)
        setContentView(R.layout.activity_coba_activity)
        setSupportActionBar(toolbar)

        mwork = findViewById(R.id.tugas)
        mtanggal = findViewById(R.id.date)
        kirim = findViewById(R.id.saveBtn)

        saveBtn!!.setOnClickListener { pindahLayout() }
    }
        private fun pindahLayout(){
            val i = Intent(this,MainActivity::class.java)
            i.putExtra("Tugas",mwork!!.text.toString())
            i.putExtra("Tanggal",mtanggal!!.text.toString())
            startActivity(i)}
        }

