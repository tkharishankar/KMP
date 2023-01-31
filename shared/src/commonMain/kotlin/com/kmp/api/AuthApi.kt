package com.kmp.api

import com.kmp.Config
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable
import org.koin.core.component.KoinComponent

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
@Serializable
data class AuthReq(var username: String, var password: String)

@Serializable
data class AuthRes(var access: String, var refresh: String)

class AuthApi(
    private val client: HttpClient,
) : KoinComponent {

    suspend fun getAccessToken(req: AuthReq) =
        client.post(Config.AUTH_TOKEN.url) {
            setBody(req)
        }.body<AuthRes>()
}