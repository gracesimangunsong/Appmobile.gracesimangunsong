package com.example.appmobile

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmobile.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productList = listOf(
            Product(R.drawable.matcha_latte, "Matcha Latte", "Matcha hangat dengan susu lembut."),
            Product(R.drawable.matcha_ice, "Matcha Ice", "Matcha dingin segar dengan es batu."),
            Product(
                R.drawable.matcha_espreso,
                "Matcha Espresso",
                "Paduan matcha dan espresso yang kuat."
            ),
            Product(
                R.drawable.matcha_frape,
                "Matcha Frappe",
                "Matcha diblender dengan es dan susu."
            ),
            Product(
                R.drawable.matcha_milkshake,
                "Matcha Milkshake",
                "Milkshake lembut dengan rasa matcha premium."
            )
        )
        val adapter = InfoAdapter(productList)
        binding.rvMatcha.layoutManager = LinearLayoutManager(this)
        binding.rvMatcha.adapter = adapter

        class MainActivity : AppCompatActivity() {

            override fun onCreateOptionsMenu(menu: Menu?): Boolean {
                menuInflater.inflate(R.menu.menu_option, menu)
                return true
            }
        }

    }
}










