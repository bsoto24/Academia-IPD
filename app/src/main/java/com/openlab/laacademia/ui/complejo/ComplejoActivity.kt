package com.openlab.laacademia.ui.complejo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import kotlinx.android.synthetic.main.activity_complejos.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejoActivity : AppCompatActivity(), Complejo.View {

    lateinit var presenter: Complejo.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complejos)

        rvComplejos.layoutManager = GridLayoutManager(this, 2)

        presenter = ComplejoPresenter(this)
        presenter.getComplejos()
    }


    override fun showComplejos(complejos: ArrayList<ComplejoTO>) {
        rvComplejos.adapter = ComplejosAdapter(complejos, this)
    }

}