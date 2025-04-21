package com.example.appmobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var btnReset: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        etEmail = findViewById(R.id.etEmail)
        btnReset = findViewById(R.id.btnReset)

        btnReset.setOnClickListener {
            val email = etEmail.text.toString()
            Toast.makeText(this, "Link reset password dikirim ke $email", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
