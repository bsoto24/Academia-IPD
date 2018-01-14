package com.openlab.laacademia.ui.main.complejos

import com.openlab.laacademia.data.entity.ComplejoTO

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosModel constructor(private var presenter: Complejos.Presenter): Complejos.Model {

    override fun getComplejos() {
        val complejos: ArrayList<ComplejoTO> = ArrayList()
        complejos.add(ComplejoTO("C.D. CANTO GRANDE", "http://www.ipd.gob.pe/images/C.D._Canto_Grande.jpg"))
        complejos.add(ComplejoTO("C.D. LOS OLIVOS", "http://www.ipd.gob.pe/images/C.D._Los_Olivos.jpg"))
        complejos.add(ComplejoTO("C.D. COLISEO EDUARDO DIBÓS", "http://www.ipd.gob.pe/images/C.D._Coliseo_Eduardo_Dibos.jpg"))
        presenter.showComplejos(complejos)
    }

}