package com.example.appmobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val imgProfile: ImageView = findViewById(R.id.imgProfile)
        val tvName: TextView = findViewById(R.id.tvName)
        val tvStatistics: TextView = findViewById(R.id.tvStatistics)

        val sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE)
        val userName = sharedPreferences.getString("userName", "Guest")
        val totalMatcha = sharedPreferences.getInt("totalMatcha", 0)


        val userProfileImage = R.drawable.profile

        imgProfile.setImageResource(userProfileImage)
        tvName.text = userName
        tvStatistics.text = "Total Matcha: $totalMatcha"
    }
}


