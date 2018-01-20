package com.openlab.laacademia.ui.main.deportes

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.DisciplinaTO
import kotlinx.android.synthetic.main.fragment_disciplinas.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class DisciplinasFragment : Fragment(), Disciplinas.View{

    var presenter: Disciplinas.Presenter = DisciplinasPresenter(this)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_disciplinas, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getDisciplinas()

    }

    override fun showDisciplinas(disciplinas: ArrayList<DisciplinaTO>) {
        rvDisciplinas.layoutManager = GridLayoutManager(this.context, 2)
        rvDisciplinas.adapter = DisciplinasAdapter(disciplinas, this.context)
    }

}