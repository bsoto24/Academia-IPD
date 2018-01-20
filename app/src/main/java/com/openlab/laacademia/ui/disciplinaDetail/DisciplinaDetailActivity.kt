package com.openlab.laacademia.ui.disciplinaDetail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.openlab.laacademia.R
import com.openlab.laacademia.data.entity.DisciplinaTO
import com.openlab.laacademia.util.ActivityUtils.Companion.loadUrl
import kotlinx.android.synthetic.main.activity_disciplina_detail.*

/**
 * Created by Bryam Soto on 20/01/2018.
 */
class DisciplinaDetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplina_detail)
        bind(intent.extras?.getSerializable("data") as DisciplinaTO)
    }

    fun bind(disciplinaTO: DisciplinaTO){
        loadUrl(disciplinaTO.photo, imgDisciplina)
        tvDisciplinaName.text = disciplinaTO.name
    }
}