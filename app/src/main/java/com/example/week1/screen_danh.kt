package com.example.week1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class screen_danh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_danh)
        val click: ImageButton =  findViewById(R.id.movewel);
        click.setOnClickListener{
            val intent = Intent(this,screen_signup::class.java)
            startActivity(intent)
        }
    }
}