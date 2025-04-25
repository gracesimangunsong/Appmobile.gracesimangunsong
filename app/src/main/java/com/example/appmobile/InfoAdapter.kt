package com.example.appmobile

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InfoAdapter(private val list: List<Product>) : RecyclerView.Adapter<InfoAdapter.InfoViewHolder>() {



    inner class InfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDesc: TextView = itemView.findViewById(R.id.tvDesc)
        val imgCoffee: ImageView = itemView.findViewById(R.id.imgCoffee)


        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                val context = itemView.context
                val product = list[position]
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("product", product) // Kirim product sebagai Serializable
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_info, parent, false)
        return InfoViewHolder(view)
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        val product = list[position]
        holder.tvTitle.text = product.name
        holder.tvDesc.text = product.description
        holder.imgCoffee.setImageResource(product.imageResId)
    }

    override fun getItemCount(): Int = list.size
}
