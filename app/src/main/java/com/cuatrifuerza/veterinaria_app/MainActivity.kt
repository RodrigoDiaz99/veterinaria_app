package com.cuatrifuerza.veterinaria_app

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    val productCategoryAdapter: ProductCategoryAdapter? = null
    val productCatRecycler: RecyclerView? = null
    val prodItemRecycler: RecyclerView? = null
    val productAdapter: ProductAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productCategoryList: MutableList<ProductCategory> = ArrayList<ProductCategory>()
        productCategoryList.add(ProductCategory(1, "Trending"))
        productCategoryList.add(ProductCategory(2, "Most Popular"))
        productCategoryList.add(ProductCategory(3, "All Body Products"))
        productCategoryList.add(ProductCategory(4, "Skin Care"))
        productCategoryList.add(ProductCategory(5, "Hair Care"))
        productCategoryList.add(ProductCategory(6, "Make Up"))
        productCategoryList.add(ProductCategory(7, "Fragrance"))
        setProductRecycler(productCategoryList)
        val productsList: MutableList<Products> = ArrayList<Products>()
        productsList.add(Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2))
        productsList.add(Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1))
        productsList.add(Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2))
        productsList.add(Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1))
        productsList.add(Products(1, "Japanese Cherry Blossom", "250 ml", "$ 17.00", R.drawable.prod2))
        productsList.add(Products(2, "African Mango Shower Gel", "350 ml", "$ 25.00", R.drawable.prod1))
        setProdItemRecycler(productsList)
    }

    private fun setProductRecycler(productCategoryList: List<ProductCategory>) {
        productCatRecycler = findViewById(R.id.cat_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        productCatRecycler.setLayoutManager(layoutManager)
        productCategoryAdapter = ProductCategoryAdapter(this, productCategoryList)
        productCatRecycler.setAdapter(productCategoryAdapter)
    }

    private fun setProdItemRecycler(productsList: List<Products>) {
        prodItemRecycler = findViewById(R.id.product_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        prodItemRecycler.setLayoutManager(layoutManager)
        productAdapter = ProductAdapter(this, productsList)
        prodItemRecycler.setAdapter(productAdapter)
    } // Hi all today we are going to make a online product selling app.
    // basically its a cosmatic selling app.
    // The design is very coll and something new from traditional design.
    // But before getting started lets make sure to subscribe and hit
    // the bell icon to get latest update and notified enerytime i post a new video.
    // so lets get started
    // lets app some font and import some image assets
    // Now we will setup a recyclerview for product category list.
    // now we will ad a model class for our category
    // lets create a adapter class for data model
    // Our adapter class is ready Now we will setup recyclerview
    //now we will add some data to our model class
    // Lets run and see
    // so we have setup category recycler.
    // Now in a same way we create a another recycycler view for products
    // first we make model class then adapter
    // product recycler also setup.
    // now we will setup on clicklistener on products and navigate to details activity.
    // lets do this.
    // before going to details page we need cart button in home page and some layout setup.
    // Now its perfect
    // lets move to the details activity.
    // so lets add some animation in this.
    // So this tutorial has been completed if you love my work plz like share and subscribe
    // and dont forget to comments
    // see you in the next video
}