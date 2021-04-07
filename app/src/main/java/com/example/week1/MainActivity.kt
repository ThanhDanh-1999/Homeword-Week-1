package com.example.week1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click1: Button =  findViewById(R.id.a1);
        click1.setOnClickListener{
            val data1 = Intent(this,screen_welcome::class.java)
            startActivity(data1)
        }

        val click2: Button =  findViewById(R.id.a2);
        click2.setOnClickListener{
            val data2 = Intent(this,screen_danh::class.java)
            startActivity(data2);
        }

        val click3: Button =  findViewById(R.id.a3);
        click3.setOnClickListener{
            val data3 = Intent(this,screen_login::class.java)
            startActivity(data3);
        }

        val click4: Button =  findViewById(R.id.a4);
        click4.setOnClickListener{
            val data4 = Intent(this,screen_signup::class.java)
            startActivity(data4);
        }

        val click5: Button =  findViewById(R.id.a5);
        click5.setOnClickListener{
            val data5 = Intent(this,screen_verify::class.java)
            startActivity(data5);
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}