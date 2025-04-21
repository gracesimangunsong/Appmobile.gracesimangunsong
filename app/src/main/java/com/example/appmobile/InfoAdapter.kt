package com.example.appmobile

import android.content.Intent
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InfoAdapter(private val list: List<String>) : RecyclerView.Adapter<InfoAdapter.InfoViewHolder>() {

    private val images = listOf(
        R.drawable.matcha_latte,
        R.drawable.matcha_ice,
        R.drawable.matcha_espreso,
        R.drawable.matcha_frape,
        R.drawable.matcha_milkshake
    )

    private val titles = listOf(
        "Matcha Latte",
        "Matcha Ice",
        "Matcha Espresso",
        "Matcha Frappe",
        "Matcha Milkshake"
    )

    private val descriptions = listOf(
        "Matcha hangat dengan susu lembut.",
        "Matcha dingin segar dengan es batu.",
        "Paduan matcha dan espresso yang kuat.",
        "Matcha diblender dengan es dan susu.",
        "Milkshake lembut dengan rasa matcha premium."
    )





    inner class InfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDesc: TextView = itemView.findViewById(R.id.tvDesc)
        val imgCoffee: ImageView = itemView.findViewById(R.id.imgCoffee)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_info, parent, false)
        return InfoViewHolder(view)
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.tvTitle.text = titles[position]
        holder.tvDesc.text = descriptions[position]
        holder.itemView.setOnClickListener {

            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("image", images[position])
            intent.putExtra("title", titles[position])
            intent.putExtra("desc", descriptions[position])
            context.startActivity(intent)
        }



        holder.imgCoffee.setImageResource(images[position])


        holder.tvTitle.text = titles[position]
        holder.tvDesc.text = descriptions[position]

    }

    override fun getItemCount(): Int = list.size
}



