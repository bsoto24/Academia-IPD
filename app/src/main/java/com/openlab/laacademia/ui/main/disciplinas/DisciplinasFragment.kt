package com.openlab.laacademia.ui.main.disciplinas

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.DisciplinaTO
import com.openlab.laacademia.ui.disciplinaDetail.DisciplinaDetailActivity
import com.openlab.laacademia.util.FragmentUtils.Companion.nextActivityFromFragment
import kotlinx.android.synthetic.main.fragment_disciplinas.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class DisciplinasFragment : Fragment(), Disciplinas.View, Disciplinas.OnDisciplinaClickListener{

    var presenter: Disciplinas.Presenter = DisciplinasPresenter(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.fragment_disciplinas, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDisciplinas()

    }

    override fun showDisciplinas(disciplinas: List<DisciplinaTO>) {
        rvDisciplinas.layoutManager = GridLayoutManager(context, 2)
        rvDisciplinas.adapter = DisciplinasAdapter(disciplinas, context, this)
    }

    override fun onDisciplinaClick(disciplinaTO: DisciplinaTO) = nextActivityFromFragment(context, DisciplinaDetailActivity::class.java, disciplinaTO, false)

}