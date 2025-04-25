package com.example.appmobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

abstract class DetailActivity : AppCompatActivity() {
    data class Product(
        val imageResId: Int,
        val name: String,
        val description: String
    ) : Serializable



    abstract val root: Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetail: ImageView = findViewById(R.id.imgDetail)
        val tvDetailTitle: TextView = findViewById(R.id.tvDetailTitle)
        val tvDetailDesc: TextView = findViewById(R.id.tvDetailDesc)


        val imageRes = intent.getIntExtra("image", 0)
        val title = intent.getStringExtra("title")
        val desc = intent.getStringExtra("desc")


        if (imageRes != 0) {
            imgDetail.setImageResource(imageRes)


            imgDetail.setImageResource(imageRes)
            tvDetailTitle.text = title
            tvDetailDesc.text = desc
        }
    }
}
