package com.kmp.android.di

import com.kmp.android.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Author: Hari K
 * Date: 31/01/2023.
 */
val appModule = module{
    viewModel{ LoginViewModel(dataSourceImpl = get())}
}