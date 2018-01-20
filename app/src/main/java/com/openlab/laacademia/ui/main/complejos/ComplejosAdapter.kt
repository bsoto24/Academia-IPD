package com.openlab.laacademia.ui.main.complejos

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import com.squareup.picasso.Picasso

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosAdapter constructor(private var complejos: List<ComplejoTO>, private var context: Context, private var onComplejoClickListener: Complejos.OnComplejoClickListener) : RecyclerView.Adapter<ComplejosAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_complejo, parent, false), onComplejoClickListener)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(complejos[position])

    override fun getItemCount(): Int = complejos.size

    class ViewHolder constructor(itemView: View, private var onComplejoClickListener: Complejos.OnComplejoClickListener) : RecyclerView.ViewHolder(itemView){

        private val tvComplejo: TextView = itemView.findViewById(R.id.tvComplejoName)
        private val imgComplejo: ImageView = itemView.findViewById(R.id.imgComplejo)

        fun bind(complejo: ComplejoTO) {
            tvComplejo.text = complejo.name
            imgComplejo.loadUrl(complejo.photo)
            itemView.setOnClickListener{
                onComplejoClickListener.onComplejoClick(complejo)
            }
        }

        private fun ImageView.loadUrl(photo: String) =
                Picasso.with(context)
                        .load(photo)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder)
                        .into(imgComplejo)

    }
}