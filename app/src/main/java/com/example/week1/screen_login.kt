package com.example.week1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class screen_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)
        val click: Button =  findViewById(R.id.dangky);
        click.setOnClickListener{
            val intent = Intent(this,screen_signup::class.java)
            startActivity(intent)
        }
    }
}