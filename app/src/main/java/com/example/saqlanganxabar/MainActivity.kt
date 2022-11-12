package com.example.saqlanganxabar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnKirish:Button
    lateinit var txtView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       btnKirish=findViewById(R.id.btnKirish)
        txtView=findViewById(R.id.txtView)
        btnKirish.setOnClickListener {
            txtView.setText("Ahrorbek Pragrames Bola ")
        }
    }
}