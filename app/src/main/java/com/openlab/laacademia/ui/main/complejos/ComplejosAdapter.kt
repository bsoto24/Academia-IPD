package com.openlab.laacademia.ui.main.complejos

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.ComplejoTO
import com.squareup.picasso.Picasso

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosAdapter constructor(private var complejos: ArrayList<ComplejoTO>, private var context: Context) : RecyclerView.Adapter<ComplejosAdapter.ComplejoVH>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ComplejoVH = ComplejoVH(LayoutInflater.from(context).inflate(R.layout.item_complejo, parent, false))

    override fun onBindViewHolder(holder: ComplejoVH, position: Int) = holder.bind(complejos[position], context)

    override fun getItemCount(): Int = complejos.size

    class ComplejoVH constructor(view: View) : RecyclerView.ViewHolder(view) {

        private val tvComplejo: TextView = view.findViewById(R.id.tvComplejo)
        private val imgComplejo: ImageView = view.findViewById(R.id.imgComplejo)

        fun bind(complejo: ComplejoTO, context: Context) =
                with(complejo) {
                    tvComplejo.text = complejo.name
                    imgComplejo.loadUrl(complejo.photo)
                    imgComplejo.setOnClickListener {
                        Toast.makeText(context, complejo.name, Toast.LENGTH_SHORT).show()
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