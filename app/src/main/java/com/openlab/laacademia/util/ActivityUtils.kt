package com.openlab.laacademia.util

import android.content.Context
import android.content.Intent
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import android.widget.Toast
import com.openlab.laacademia.R
import com.squareup.picasso.Picasso
import java.io.Serializable

/**
 * Created by Bryam Soto on 14/01/2018.
 */
class ActivityUtils {

    companion object {

        private inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) = beginTransaction().func().commit()

        fun AppCompatActivity.setFragment(fragment: Fragment, frameId: Int) = supportFragmentManager.inTransaction { replace(frameId, fragment) }

        fun AppCompatActivity.showToolbar(title: CharSequence, upButton: Boolean, toolbar: Toolbar) {
            setSupportActionBar(toolbar)
            toolbar.title = title
        }

        fun AppCompatActivity.nextActivity(context: Context, activity: Class<*>, data: Serializable?, finish: Boolean?) {
            val intent = Intent(context, activity)
            if (finish!!) finish()
            data ?: intent.putExtra("data", data)
            startActivity(intent)
        }

        fun AppCompatActivity.showToastMessage(message: CharSequence, duration: Int) = Toast.makeText(baseContext, message, duration).show()

        fun AppCompatActivity.showSnackbarMessage(message: CharSequence, duration: Int) = Snackbar.make(findViewById(android.R.id.content), message, duration).show()


        fun AppCompatActivity.loadUrl(photo: String, imageView: ImageView) =
                Picasso.with(baseContext)
                        .load(photo)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(imageView)

        fun AppCompatActivity.getStringResource(string : Int) = resources.getString(string)

    }

}