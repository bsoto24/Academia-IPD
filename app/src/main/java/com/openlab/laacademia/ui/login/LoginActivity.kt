package com.openlab.laacademia.ui.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.openlab.laacademia.R
import com.openlab.laacademia.ui.main.MainActivity
import com.openlab.laacademia.util.ActivityUtils.Companion.nextActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), Login.View {

    lateinit var presenter: Login.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

        btnIngresar.setOnClickListener {

            presenter.login(edtUser.text.toString(), edtPassword.text.toString())

        }
    }

    override fun showMessage(message: CharSequence) {
        Snackbar.make(lyContainer, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun loginSuccessful() {
        nextActivity(this, MainActivity::class.java, true)
    }

}