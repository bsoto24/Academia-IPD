package com.openlab.laacademia.ui.main.deportes

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
interface Disciplinas{

    interface Model{
        fun getDisciplinas()
    }

    interface View{
        fun showDisciplinas(disciplinas: ArrayList<DisciplinaTO>)
    }

    interface Presenter{
        fun getDisciplinas()
        fun showDisciplinas(disciplinas: ArrayList<DisciplinaTO>)
    }

}