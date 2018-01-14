package com.openlab.laacademia.ui.complejo

import com.openlab.laacademia.data.entity.ComplejoTO

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejoPresenter constructor(private var view: Complejo.View): Complejo.Presenter{

    var model: Complejo.Model = ComplejoModel(this)

    override fun getComplejos() {
        model.getComplejos()
    }

    override fun showComplejos(complejos: ArrayList<ComplejoTO>) {
        view.showComplejos(complejos)
    }

}