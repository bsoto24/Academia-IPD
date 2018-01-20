package com.openlab.laacademia.ui.login

/**
 * Created by Bryam Soto on 12/01/2018.
 */
class LoginPresenter constructor(private var view: Login.View) : Login.Presenter{

    private var model: Login.Model = LoginModel(this)

    override fun login(user: CharSequence, password: CharSequence){
        model.login(user, password)
    }

    override fun showMessage(message: CharSequence) {
        view.showMessage(message)
    }

    override fun loginSuccessful() {
        view.loginSuccessful()
    }


}