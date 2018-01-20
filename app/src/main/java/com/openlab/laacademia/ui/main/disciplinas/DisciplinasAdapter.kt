package com.openlab.laacademia.ui.main.disciplinas

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
class DisciplinasAdapter constructor(private var disciplinas: List<DisciplinaTO>, private var context: Context, private var onDisciplinaClickListener: Disciplinas.OnDisciplinaClickListener) : RecyclerView.Adapter<DisciplinasAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_disciplina, parent, false), onDisciplinaClickListener)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(disciplinas[position])

    override fun getItemCount(): Int = disciplinas.size

    class ViewHolder constructor(itemView: View, private var onDisciplinaClickListener: Disciplinas.OnDisciplinaClickListener) : RecyclerView.ViewHolder(itemView){

        private var imgDisciplina: ImageView = itemView.findViewById(R.id.imgDisciplina)
        private var tvDisciplina: TextView = itemView.findViewById(R.id.tvDisciplinaName)

        fun bind(disciplinaTO: DisciplinaTO) {
            tvDisciplina.text = disciplinaTO.name
            imgDisciplina.loadUrl(disciplinaTO.photo)
            itemView.setOnClickListener{
                onDisciplinaClickListener.onDisciplinaClick(disciplinaTO)
            }
        }


        private fun ImageView.loadUrl(photo: String) =
                Picasso.with(context)
                        .load(photo)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(imgDisciplina)

    }

}