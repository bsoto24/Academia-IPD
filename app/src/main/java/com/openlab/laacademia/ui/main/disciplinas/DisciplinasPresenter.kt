package com.openlab.laacademia.ui.main.disciplinas

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
class DisciplinasPresenter constructor(private var view: Disciplinas.View) : Disciplinas.Presenter{

    private var model: Disciplinas.Model = DisciplinasModel(this)

    override fun getDisciplinas() = model.getDisciplinas()

    override fun showDisciplinas(disciplinas: List<DisciplinaTO>) = view.showDisciplinas(disciplinas)

}