package com.openlab.laacademia.ui.main.complejos

import com.openlab.laacademia.data.entity.ComplejoTO

/**
 * Created by Bryam Soto on 12/01/2018.
 */
interface Complejos {

    interface Model{
        fun getComplejos()
    }

    interface View{
        fun showComplejos(complejos: ArrayList<ComplejoTO>)
    }

    interface Presenter{
        fun getComplejos()
        fun showComplejos(complejos: ArrayList<ComplejoTO>)
    }

}