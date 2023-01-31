package com.kmp.android.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmp.data.DataSource
import kotlinx.coroutines.launch


/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
class LoginViewModel(
    private val dataSourceImpl: DataSource,
) : ViewModel() {
    var logger = "LoginViewModel"
    fun getAccessToken(username: String, password: String) {
        Log.i(logger, "username: $username - password: $password")
        viewModelScope.launch {
            dataSourceImpl.accessToken(username,password)
        }
    }
}