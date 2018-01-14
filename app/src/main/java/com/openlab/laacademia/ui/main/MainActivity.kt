package com.openlab.laacademia.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.openlab.laacademia.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId) {
            R.id.complejos -> {
                flContainer.background = ContextCompat.getDrawable(baseContext, R.color.turquesa_ipd)
                return@OnNavigationItemSelectedListener true
            }
            R.id.deportes -> {
                flContainer.background = ContextCompat.getDrawable(baseContext, R.color.amarillo_ipd)
                return@OnNavigationItemSelectedListener true
            }
            R.id.hijos -> {
                flContainer.background = ContextCompat.getDrawable(baseContext, R.color.verde_ipd)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}