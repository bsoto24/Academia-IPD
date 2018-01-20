package com.openlab.laacademia.ui.main.complejos

import com.openlab.laacademia.data.entity.ComplejoTO

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosPresenter constructor(private var view: Complejos.View): Complejos.Presenter {

    private var model: Complejos.Model = ComplejosModel(this)

    override fun getComplejos() = model.getComplejos()

    override fun showComplejos(complejos: ArrayList<ComplejoTO>) = view.showComplejos(complejos)

}