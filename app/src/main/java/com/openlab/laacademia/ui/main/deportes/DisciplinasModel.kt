package com.openlab.laacademia.ui.main.deportes

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
class DisciplinasModel(private var presenter: Disciplinas.Presenter) : Disciplinas.Model {

    override fun getDisciplinas() {
        val disciplinas: ArrayList<DisciplinaTO> = ArrayList()
        disciplinas.add(DisciplinaTO("Futbol1", "Futbol1"))
        disciplinas.add(DisciplinaTO("Futbol2", "Futbol2"))
        disciplinas.add(DisciplinaTO("Futbol3", "Futbol3"))
        disciplinas.add(DisciplinaTO("Futbol4", "Futbol4"))
        disciplinas.add(DisciplinaTO("Futbol5", "Futbol5"))
        presenter.showDisciplinas(disciplinas)
    }

}