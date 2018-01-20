package com.openlab.laacademia.ui.registro

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.openlab.laacademia.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError

/**
 * Created by Bryam Soto on 17/01/2018.
 */
class StepFragment1 : Fragment(), Step{

    lateinit var tvStep : TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view : View = inflater.inflate(R.layout.fragment_step1, container, false)

        tvStep = view.findViewById(R.id.tvStep)

        return view
    }

    override fun onSelected() {
        tvStep.text = "Seleccionado"
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onError(error: VerificationError) {
        Toast.makeText(context, "Error $error", Toast.LENGTH_SHORT).show()
    }

}