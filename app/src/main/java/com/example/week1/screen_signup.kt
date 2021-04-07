package com.example.week1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class screen_signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_signup)
        val click0: Button =  findViewById(R.id.dangnhap);
        click0.setOnClickListener{
            val intent = Intent(this,screen_login::class.java)
            startActivity(intent)
        }

        val click1: Button =  findViewById(R.id.r8);
        click1.setOnClickListener{
            val intent = Intent(this,screen_login::class.java)
            startActivity(intent)
        }
    }
}