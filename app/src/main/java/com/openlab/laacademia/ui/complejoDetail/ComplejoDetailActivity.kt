package com.openlab.laacademia.ui.complejoDetail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import com.openlab.laacademia.util.ActivityUtils.Companion.loadUrl
import kotlinx.android.synthetic.main.activity_complejo_detail.*

/**
 * Created by Bryam Soto on 20/01/2018.
 */
class ComplejoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complejo_detail)
        bind(intent.extras?.getSerializable("data") as ComplejoTO)
    }

    fun bind(complejoTO: ComplejoTO) {
        loadUrl(complejoTO.photo, imgComplejo)
        tvComplejoName.text = complejoTO.name
        val sb = StringBuilder()
        for (index in 0 until 10) {
            sb.append("${complejoTO.name} $index \n")
        }
        tvComplejoDetail.text = sb.toString()
    }

}