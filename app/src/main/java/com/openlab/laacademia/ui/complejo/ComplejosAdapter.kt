package com.openlab.laacademia.ui.complejo

import android.content.Context
import android.support.design.widget.Snackbar
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
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class ComplejosAdapter constructor(private var complejos : ArrayList<ComplejoTO>, private var context: Context): RecyclerView.Adapter<ComplejosAdapter.ComplejoVH>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ComplejoVH {
        return ComplejoVH(LayoutInflater.from(context).inflate(R.layout.item_complejo, parent, false))
    }

    override fun onBindViewHolder(holder: ComplejoVH, position: Int) {
        val item = complejos.get(position)
        holder.bind(item, context)
    }

    override fun getItemCount(): Int {
        return complejos.size
    }

    class ComplejoVH constructor(view: View) : RecyclerView.ViewHolder(view){

        val tvComplejo : TextView = view.findViewById(R.id.tvComplejo)
        val imgComplejo : ImageView = view.findViewById(R.id.imgComplejo)

        fun bind(complejo:ComplejoTO, context: Context){
            tvComplejo.text = complejo.name
            imgComplejo.loadUrl(complejo.photo)
            imgComplejo.setOnClickListener{
                Toast.makeText(context, complejo.photo, Toast.LENGTH_SHORT).show()
            }
        }

        fun ImageView.loadUrl(photo: String) {
            Picasso.with(context).load(photo).into(imgComplejo)
        }

    }
}