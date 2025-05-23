package com.example.appmobile

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_profile -> {

                true
            }

            R.id.menu_logout -> {
                val sharedPref = getSharedPreferences("user_session", MODE_PRIVATE)
                sharedPref.edit {
                    clear()
                }

                val intent = Intent(this@ProfileActivity, LoginActivity::class.java)
                startActivity(intent)
                finish() // Hapus ProfileActivity dari stack
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}



