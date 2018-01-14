package com.openlab.laacademia.ui.complejo

import com.openlab.laacademia.data.entity.ComplejoTO

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejoModel constructor(private var presenter: Complejo.Presenter): Complejo.Model{

    override fun getComplejos() {
        val complejos: ArrayList<ComplejoTO> = ArrayList()
        complejos.add(ComplejoTO("http://ipd.gob.pe/images/C.D._Canto_Grande.jpg", "C.D. CANTO GRANDE"))
        complejos.add(ComplejoTO("http://ipd.gob.pe/images/C.D._Los_Olivos.jpg", "C.D. LOS OLIVOS"))
        complejos.add(ComplejoTO("http://ipd.gob.pe/images/C.D._Coliseo_Eduardo_Dibos.jpg", "C.D. COLISEO EDUARDO DIBÓS"))
        presenter.showComplejos(complejos)
    }

}