package com.openlab.laacademia.ui.registro

import android.content.Context
import android.support.v4.app.FragmentManager
import com.openlab.laacademia.R
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import com.stepstone.stepper.viewmodel.StepViewModel

/**
 * Created by Bryam Soto on 17/01/2018.
 */
class StepperAdapter constructor(fragmentManager: FragmentManager, context: Context) : AbstractFragmentStepAdapter(fragmentManager, context) {

    private val steps = arrayOf<Step>(StepFragment1(), StepFragment2(), StepFragment1())

    override fun getCount(): Int = steps.size

    override fun createStep(position: Int): Step = steps[position]

    override fun getViewModel(position: Int): StepViewModel {

        val builder = StepViewModel.Builder(context)
        when (position) {
            0 -> builder.setEndButtonLabel(R.string.siguiente).create()
            1 -> builder.setBackButtonLabel(R.string.atras).setEndButtonLabel(R.string.siguiente).create()
            2 -> builder.setBackButtonLabel(R.string.atras).setEndButtonLabel(R.string.finalizar).create()
        }
        return builder.create()

    }

}