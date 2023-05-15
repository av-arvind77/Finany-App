package dev.arvind.demo.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

inline fun <VM: ViewModel> viewModelFactory(crossinline function: () -> VM) =
    object: ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T = function() as T
    }