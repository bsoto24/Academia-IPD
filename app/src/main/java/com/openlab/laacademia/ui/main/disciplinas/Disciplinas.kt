package com.openlab.laacademia.ui.main.disciplinas

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
interface Disciplinas{

    interface Model{
        fun getDisciplinas()
    }

    interface View{
        fun showDisciplinas(disciplinas: List<DisciplinaTO>)
    }

    interface Presenter{
        fun getDisciplinas()
        fun showDisciplinas(disciplinas: List<DisciplinaTO>)
    }

    interface OnDisciplinaClickListener{
        fun onDisciplinaClick(disciplinaTO: DisciplinaTO)
    }

}