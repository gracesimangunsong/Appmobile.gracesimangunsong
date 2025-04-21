package com.example.Appmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.appmobile.LoginActivity
import com.example.appmobile.R
import com.example.appmobile.StreamActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val btnStream: Button = findViewById(R.id.btnStream)
        btnStream.setOnClickListener {
            startActivity(Intent(this, StreamActivity::class.java))
        }
    }
}


