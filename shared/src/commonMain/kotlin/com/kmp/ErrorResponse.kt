package com.kmp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
@Serializable
data class ErrorResponse (
    var statusCode: Int? = 0,
    @SerialName("status_message")
    var statusMessage: String? = "",
    var success: Boolean? = false
)