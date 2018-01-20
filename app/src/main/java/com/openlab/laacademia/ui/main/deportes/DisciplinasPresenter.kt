package com.openlab.laacademia.ui.main.deportes

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
class DisciplinasPresenter constructor(private var view: Disciplinas.View) : Disciplinas.Presenter{

    var model: Disciplinas.Model = DisciplinasModel(this)

    override fun getDisciplinas() {
        model.getDisciplinas()
    }

    override fun showDisciplinas(disciplinas: ArrayList<DisciplinaTO>) {
        view.showDisciplinas(disciplinas)
    }

}