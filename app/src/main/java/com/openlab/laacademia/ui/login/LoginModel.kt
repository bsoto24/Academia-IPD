package com.openlab.laacademia.ui.login

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class LoginModel constructor(private var presenter: Login.Presenter): Login.Model{

    override fun login(user: CharSequence, password: CharSequence) = if (user == password) presenter.loginSuccessful() else presenter.showMessage("Usuario y/o contraseña incorrectos")

}