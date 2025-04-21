package com.example.appmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StreamActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stream)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rvStream)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val btnStream: Button = findViewById(R.id.btnStream)
        btnStream.setOnClickListener {
            val intent = Intent(this, StreamActivity::class.java)
            startActivity(intent)
        }


        val infoAdapter = InfoAdapter(listOf())
        recyclerView.adapter = infoAdapter
    }
}
