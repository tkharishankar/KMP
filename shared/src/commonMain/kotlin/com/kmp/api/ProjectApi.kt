package com.kmp.api

import com.kmp.Config
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import org.koin.core.component.KoinComponent

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */

data class Project(
    var id:String,
    var title: String,
    var description: String,
    var created:String,
    var owner:String,
)

class ProjectApi(private val httpClient: HttpClient) :KoinComponent {
    suspend fun getProjects() = httpClient.get(Config.PROJECTS.url)
        .body<Project>()
}