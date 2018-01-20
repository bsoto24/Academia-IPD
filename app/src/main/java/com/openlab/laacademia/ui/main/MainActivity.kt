package com.openlab.laacademia.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.openlab.laacademia.R
import com.openlab.laacademia.ui.main.complejos.ComplejosFragment
import com.openlab.laacademia.ui.main.disciplinas.DisciplinasFragment
import com.openlab.laacademia.ui.main.hijos.HijosFragment
import com.openlab.laacademia.util.ActivityUtils.Companion.setFragment
import com.openlab.laacademia.util.ActivityUtils.Companion.showToolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        when (item.itemId) {
            R.id.complejos -> {
                setFragment(ComplejosFragment(), R.id.flContainer)
                return@OnNavigationItemSelectedListener true
            }
            R.id.deportes -> {
                setFragment(DisciplinasFragment(), R.id.flContainer)
                return@OnNavigationItemSelectedListener true
            }
            R.id.cursos -> {
                setFragment(HijosFragment(), R.id.flContainer)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        showToolbar("La Academia", false, toolbar)
        setFragment(ComplejosFragment(), R.id.flContainer)
    }

}