package com.openlab.laacademia.util

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import java.io.Serializable

/**
 * Created by Bryam Soto on 20/01/2018.
 */
class FragmentUtils {

    companion object {

        fun Fragment.nextActivityFromFragment(context: Context, activity: Class<*>, data: Serializable?, finish: Boolean?) {
            val intent = Intent(context, activity)
            if (finish!!) getActivity().finish()
            data?.let { intent.putExtra("data", data) }
            getActivity().startActivity(intent)
        }
    }
}