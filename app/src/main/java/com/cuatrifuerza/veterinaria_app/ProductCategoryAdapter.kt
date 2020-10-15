package com.cuatrifuerza.veterinaria_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.cuatrifuerza.veterinaria_app.ProductCategoryAdapter.ProductViewHolder
import com.cuatrifuerza.veterinaria_app.ProductCategory

class ProductCategoryAdapter(var context: Context, var productCategoryList: List<ProductCategory>) :
    RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_row_item, parent, false)
        // lets create a recyclerview row item layout file
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.catagoryName.text = productCategoryList[position].productName
    }

    override fun getItemCount(): Int {
        return productCategoryList.size
    }

    class ProductViewHolder(itemView: View) : ViewHolder(itemView) {
        var catagoryName: TextView

        init {
            catagoryName = itemView.findViewById(R.id.cat_name)
        }
    }
}