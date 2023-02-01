package com.kmp

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
class CustomException(var errorResponse: ErrorResponse) : Exception() {
    companion object {
        fun getDefaultError(errorMessage: String?): ErrorResponse {
            return ErrorResponse(1, "SOMETHING_WENT_WRONG", false)
        }
        fun getNoInternetError(): ErrorResponse {
            return ErrorResponse(1, "NO_INTERNET_CONNECTION", false)
        }
    }
}