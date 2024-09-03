package com.cinicaragua.bienesraices.Repositories

import com.cinicaragua.bienesraices.AppDatabases.AppDataBase
import com.cinicaragua.bienesraices.Entities.NuevaCasa
import kotlinx.coroutines.flow.Flow


class MainRepository (private val db: AppDataBase) {
    fun selectAllCasas(): Flow<List<NuevaCasa>>{
        return db.CasaDao().selectAllNuevaCasa()
    }
    fun selectCasa(id : Int) : Flow<NuevaCasa>{
        return db.CasaDao().selectNuevaCasa(id)
    }
}