package com.kmp

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
enum class Config(val url: String) {
    OFFICE_BASE(url = "http://10.39.1.169:8000/"),
    HOME_BASE(url = "http://192.168.1.14:8000/"),
    AUTH_TOKEN("api/users/token/"),
    PROJECTS("api/projects")
}