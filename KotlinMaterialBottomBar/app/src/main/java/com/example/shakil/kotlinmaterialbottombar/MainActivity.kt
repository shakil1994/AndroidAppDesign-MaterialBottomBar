package com.example.shakil.kotlinmaterialbottombar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            Toast.makeText(this@MainActivity, "FAB click", Toast.LENGTH_SHORT).show()
        }

        bottom_app_bar.replaceMenu(R.menu.menu_main)

        bottom_app_bar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_cart -> Toast.makeText(this@MainActivity, "Cart click", Toast.LENGTH_SHORT).show()
                R.id.action_shipping -> Toast.makeText(this@MainActivity, "Shipping click", Toast.LENGTH_SHORT).show()
                R.id.action_customer -> Toast.makeText(this@MainActivity, "Customer click", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}
