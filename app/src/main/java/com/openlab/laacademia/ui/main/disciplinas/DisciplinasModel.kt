package com.openlab.laacademia.ui.main.disciplinas

import com.openlab.laacademia.data.entity.DisciplinaTO

/**
 * Created by Bryam Soto on 16/01/2018.
 */
class DisciplinasModel(private var presenter: Disciplinas.Presenter) : Disciplinas.Model {

    override fun getDisciplinas() {
        val disciplinas: ArrayList<DisciplinaTO> = ArrayList()
        disciplinas.add(DisciplinaTO("Futbol", "http://superliga.pe/superligape/uploads/cmd1.jpg"))
        disciplinas.add(DisciplinaTO("Voley", "http://4.bp.blogspot.com/-rHn6t4blsVM/VqlzmgTG4ZI/AAAAAAAAAJs/zpro7ldJhMs/s1600/ressitencia-3.jpg"))
        disciplinas.add(DisciplinaTO("Natación", "https://www.guiainfantil.com/uploads/salud/nina-nadando-piscina-p.jpg"))
        disciplinas.add(DisciplinaTO("Judo", "https://previews.123rf.com/images/andreyfire/andreyfire1604/andreyfire160400084/57784739-con-las-t%C3%A9cnicas-de-judo-ni%C3%B1os-cintur%C3%B3n-blanco-y-rojo-capacitados-Foto-de-archivo.jpg"))
        disciplinas.add(DisciplinaTO("Atletismo", "https://eresmama.com/wp-content/uploads/2017/11/ninos-carrera.jpg"))
        disciplinas.add(DisciplinaTO("Karate", "http://images.quebarato.com.ec/T440x/clases+privada+de+defensa+personal+kick+boxin+karate+para+ninas+ninos+damas+guayaquil+guayas+ecuador__674298_1.jpg"))
        disciplinas.add(DisciplinaTO("Tenis", "http://deporteysalud-static.hola.com/deporteparaninos/wp-content/uploads/sites/4/2014/03/que_ventajas_tiene_la_practica_del-tenis_para_los_ninos.jpg"))
        disciplinas.add(DisciplinaTO("Ciclismo", "https://cdn.pixabay.com/photo/2015/05/20/16/51/bike-775799_960_720.jpg"))
        presenter.showDisciplinas(disciplinas)
    }

}