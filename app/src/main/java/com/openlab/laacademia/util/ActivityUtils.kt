package com.openlab.laacademia.util

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

/**
 * Created by Bryam Soto on 14/01/2018.
 */
class ActivityUtils{

    companion object{
        inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
            beginTransaction().func().commit()
        }

        fun AppCompatActivity.setFragment(fragment: Fragment, frameId: Int){
            supportFragmentManager.inTransaction { replace(frameId, fragment) }
        }

        fun AppCompatActivity.showToolbar(title: CharSequence, upButton: Boolean, toolbar: Toolbar){
            setSupportActionBar(toolbar)
            toolbar.title = title
        }

    }

}