package com.example.myunittestingapplication

object RegistrationUtil {
    /*
    * -username password confirm is empty
    * -username already exists
    * -pasword mismatched with confirm
    * -password contains < 8 characters
    *
    * */
    private val userList = listOf("praveen", "prasad")
    fun validateRegistration(username: String, password: String, confirm: String): Boolean {

        if (username.isEmpty() || password.isEmpty() || confirm.isEmpty())
            return false
        if (username in userList)
            return false
        if (password.count{it.isDigit()} < 8)
            return false
        if (password != confirm)
            return false
        return true
    }
}