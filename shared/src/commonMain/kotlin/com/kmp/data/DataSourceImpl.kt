package com.kmp.data

import com.kmp.api.AuthApi
import com.kmp.api.AuthReq
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
interface DataSource {
    suspend fun accessToken(username: String, password: String)
}

class DataSourceImpl : KoinComponent, DataSource {
    private val authApi: AuthApi by inject()

    init {
        println("DataSource Init")
    }

    override suspend fun accessToken(username: String, password: String) {
        authApi.getAccessToken(AuthReq(username, password))?.fold(
            failed = { println(it.message) },
            succeeded = {
                println(it)
            },
        )
    }
}
