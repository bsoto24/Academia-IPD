package com.openlab.laacademia.ui.main.complejos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import kotlinx.android.synthetic.main.fragment_complejos.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosFragment : Fragment(), Complejos.View {

    lateinit var presenter: Complejos.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_complejos, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvComplejos.layoutManager = GridLayoutManager(this.context, 2)

        presenter = ComplejosPresenter(this)
        presenter.getComplejos()
    }

    override fun showComplejos(complejos: ArrayList<ComplejoTO>) {
        rvComplejos.adapter = ComplejosAdapter(complejos, this.context)
    }

}