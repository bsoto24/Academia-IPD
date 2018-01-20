package com.openlab.laacademia.ui.main.deportes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.DisciplinaTO
import com.squareup.picasso.Picasso

/**
 * Created by Bryam Soto on 16/01/2018.
 */
class DisciplinasAdapter constructor(private var disciplinas: ArrayList<DisciplinaTO>, private var context: Context) : RecyclerView.Adapter<DisciplinasAdapter.DisciplinaVH>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DisciplinaVH = DisciplinaVH(LayoutInflater.from(context).inflate(R.layout.item_disciplina, parent, false))

    override fun onBindViewHolder(holder: DisciplinaVH, position: Int) = holder.bind(disciplinas[position])

    override fun getItemCount(): Int = disciplinas.size

    class DisciplinaVH constructor(view: View) : RecyclerView.ViewHolder(view) {

        private var imgDisciplina: ImageView = view.findViewById(R.id.imgDisciplina)
        private var tvDisciplina: TextView = view.findViewById(R.id.tvDisciplina)

        fun bind(disciplina: DisciplinaTO) =
                with(disciplina) {
                    tvDisciplina.text = disciplina.name
                    imgDisciplina.loadUrl(disciplina.photo)
                }


        private fun ImageView.loadUrl(photo: String) =
                Picasso.with(context)
                        .load(photo)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(imgDisciplina)

    }

}