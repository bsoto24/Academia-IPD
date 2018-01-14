package com.openlab.laacademia.ui.login

/**
 * Created by Bryam Soto on 12/01/2018.
 */
interface Login{

    interface Model{
        fun login(user: CharSequence, password: CharSequence)
    }

    interface View{
        fun showMessage(message: CharSequence)
        fun loginSuccessful()
    }

    interface Presenter{
        fun login(user: CharSequence, password: CharSequence)
        fun showMessage(message: CharSequence)
        fun loginSuccessful()
    }

}