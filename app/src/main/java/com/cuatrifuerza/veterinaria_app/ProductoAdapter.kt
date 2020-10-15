package com.cuatrifuerza.veterinaria_app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.cuatrifuerza.veterinaria_app.Productdetails
import com.cuatrifuerza.veterinaria_app.R
import com.cuatrifuerza.veterinaria_app.Products


class ProductAdapter(var context: Context, var productsList: List<Products>) :
    RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_row_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.prodImage.setImageResource(productsList[position].imageUrl)
        holder.prodName.text = productsList[position].productName
        holder.prodQty.text = productsList[position].productQty
        holder.prodPrice.text = productsList[position].productPrice
        holder.itemView.setOnClickListener {
            val i = Intent(context, Productdetails::class.java)
            /*
                    Pair[] pairs = new Pair[1];
                    pairs[0] = new Pair<View, String>(holder.prodImage, "image");
                    ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pairs);
                   */context.startActivity(i /*, activityOptions.toBundle()*/)
        }
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    class ProductViewHolder(itemView: View) : ViewHolder(itemView) {
        var prodImage: ImageView
        var prodName: TextView
        var prodQty: TextView
        var prodPrice: TextView

        init {
            prodImage = itemView.findViewById(R.id.prod_image)
            prodName = itemView.findViewById(R.id.prod_name)
            prodPrice = itemView.findViewById(R.id.prod_price)
            prodQty = itemView.findViewById(R.id.prod_qty)
        }
    }
}
