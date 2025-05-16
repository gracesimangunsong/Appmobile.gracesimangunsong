package com.example.appmobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetail: ImageView = findViewById(R.id.imgDetail)
        val tvDetailTitle: TextView = findViewById(R.id.tvDetailTitle)
        val tvDetailDesc: TextView = findViewById(R.id.tvDetailDesc)

        val product = intent.getSerializableExtra("product") as? Product
        if (product != null) {
            imgDetail.setImageResource(product.imageResId)
            tvDetailTitle.text = product.name
            tvDetailDesc.text = product.description
        } else {
            Toast.makeText(this, "Data produk tidak tersedia", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
