package com.openlab.laacademia.ui.main.complejos

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import com.openlab.laacademia.ui.complejoDetail.ComplejoDetailActivity
import com.openlab.laacademia.util.FragmentUtils.Companion.nextActivityFromFragment
import kotlinx.android.synthetic.main.fragment_complejos.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosFragment : Fragment(), Complejos.View, Complejos.OnComplejoClickListener {

    var presenter: Complejos.Presenter = ComplejosPresenter(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.fragment_complejos, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getComplejos()

    }

    override fun showComplejos(complejos: List<ComplejoTO>) {
        rvComplejos.layoutManager = GridLayoutManager(context, 2)
        rvComplejos.adapter = ComplejosAdapter(complejos, context, this)
    }

    override fun onComplejoClick(complejoTO: ComplejoTO) = nextActivityFromFragment(context, ComplejoDetailActivity::class.java, complejoTO, false)

}