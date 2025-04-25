package com.example.appmobile

import java.io.Serializable

data class Product(
    val imageResId: Int,
    val name: String,
    val description: String
) : Serializable
