package com.openlab.laacademia.ui.registro

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.openlab.laacademia.R
import com.openlab.laacademia.util.ActivityUtils.Companion.showToastMessage
import com.stepstone.stepper.StepperLayout
import com.stepstone.stepper.VerificationError
import kotlinx.android.synthetic.main.activity_registro.*

/**
 * Created by Bryam Soto on 17/01/2018.
 */
class RegistroActivity : AppCompatActivity(), StepperLayout.StepperListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        stepperLayout.adapter = StepperAdapter(supportFragmentManager, this)
        stepperLayout.setListener(this)

    }

    override fun onStepSelected(newStepPosition: Int) = showToastMessage("Selected $newStepPosition", Toast.LENGTH_SHORT)

    override fun onError(verificationError: VerificationError?) = showToastMessage("Error ${verificationError.toString()}", Toast.LENGTH_SHORT)

    override fun onReturn() = finish()

    override fun onCompleted(completeButton: View?) = showToastMessage("Completed ${completeButton.toString()}", Toast.LENGTH_SHORT)

}