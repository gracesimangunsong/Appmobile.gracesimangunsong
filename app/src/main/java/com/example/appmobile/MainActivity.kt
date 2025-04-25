package com.example.appmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvMatcha)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val productList = listOf(
            Product(R.drawable.matcha_latte, "Matcha Latte", "Matcha hangat dengan susu lembut."),
            Product(R.drawable.matcha_ice, "Matcha Ice", "Matcha dingin segar dengan es batu."),
            Product(R.drawable.matcha_espreso, "Matcha Espresso", "Paduan matcha dan espresso yang kuat."),
            Product(R.drawable.matcha_frape, "Matcha Frappe", "Matcha diblender dengan es dan susu."),
            Product(R.drawable.matcha_milkshake, "Matcha Milkshake", "Milkshake lembut dengan rasa matcha premium.")
        )

        val adapter = InfoAdapter(productList)
        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    @SuppressLint("UseKtx")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.action_settings -> {
                val sharedPref = getSharedPreferences("UserSession", MODE_PRIVATE)
                sharedPref.edit().clear().apply()

                val intent = Intent(this, LoginActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}




//        binding.rvMatcha.layoutManager = LinearLayoutManager(this)
//
//
//        val adapter = InfoAdapter(listProducts)
//        binding.Rv.adapter = adapter
//





