package com.kmp

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
sealed class Either<out F, out S> {
    inline fun <T> fold(failed: (F) -> T, succeeded: (S) -> T): T =
        when (this) {
        is Failure -> failed(failure)
        is Success -> succeeded(success)
    }
}

data class Failure<out F>(val failure: F) : Either<F, Nothing>()

data class Success<out S>(val success: S) : Either<Nothing, S>()
