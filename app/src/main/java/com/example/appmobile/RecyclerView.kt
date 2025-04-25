package com.example.appmobile

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductListActivity : AppCompatActivity() {
    private lateinit var binding:DetailActivity
    private lateinit var productRecyclerView: RecyclerView
    private lateinit var productAdapter: InfoAdapter
    private lateinit var listProducts: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        lateinit var binding: DetailActivity



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        // Add product items to the list with descriptions
        listProducts.add(Product(R.drawable.matcha_ice, "Matcha Ice", "Ice Matcha adalah perpaduan yang kompleks dari rasa manis, pahit, dan dingin."))
        listProducts.add(Product(R.drawable.matcha_frape, "Matcha Frape", "Matcha Frappe/Blended: Campuran matcha, es krim, dan es batu yang diblender."))
        listProducts.add(Product(R.drawable.matcha_latte, "Matcha Latte", "Campuran matcha, susu (susu sapi, almond, oat, dll.), es, dan pemanis."))
        listProducts.add(Product(R.drawable.matcha_espreso, "Matcha Espresso", "Latte yang dibuat dengan menambahkan shot espresso ke dalam campuran matcha."))
        listProducts.add(Product(R.drawable.matcha_milkshake, "Matcha Milkshake", "Matcha Milkshake adalah minuman dingin yang creamy, terbuat dari campuran matcha dan es krim."))

        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productRecyclerView.setHasFixedSize(true)
        productAdapter = InfoAdapter(listProducts)
        productRecyclerView.adapter = productAdapter

//        // Handle item click in RecyclerView
//        productAdapter.onItemClick = { product ->
//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("product", product) // Pass product data to next activity
//            startActivity(intent)
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_profile -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.menu_logout -> {
                Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show()
                finish()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}





