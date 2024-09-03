package com.cinicaragua.bienesraices.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cinicaragua.bienesraices.Repositories.MainRepository

class ViewModelFactory (private val repo : MainRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>) : T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(repo) as T
        }

        throw IllegalArgumentException("clase de viewmodel desconocido")
    }
}