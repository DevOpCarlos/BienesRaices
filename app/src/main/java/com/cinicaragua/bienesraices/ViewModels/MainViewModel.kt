package com.cinicaragua.bienesraices.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.cinicaragua.bienesraices.Entities.NuevaCasa
import com.cinicaragua.bienesraices.Repositories.MainRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repo: MainRepository) : ViewModel() {
    fun SelectAllNuevaCasas() : LiveData<List<NuevaCasa>>{
        return repo.selectAllCasas().asLiveData(Dispatchers.IO)
    }
    fun SelectNuevaCasa(id : Int) : LiveData<NuevaCasa>{
        return repo.selectCasa(id).asLiveData(Dispatchers.IO)
    }
}