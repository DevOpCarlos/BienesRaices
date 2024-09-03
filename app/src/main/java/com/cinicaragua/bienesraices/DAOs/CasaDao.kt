package com.cinicaragua.bienesraices.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.cinicaragua.bienesraices.Entities.NuevaCasa
import kotlinx.coroutines.flow.Flow

@Dao
interface CasaDao {

        @Insert
        fun insertCasa(nuevaCasa: NuevaCasa)

        @Update
        fun updateCasa(nuevaCasa: NuevaCasa)

        @Delete
        fun deleteCasa(nuevaCasa: NuevaCasa)

    @Query("SELECT * FROM nuevaCasa")
    fun selectAllNuevaCasa() : Flow<List<NuevaCasa>>

    @Query(" SELECT * FROM nuevaCasa WHERE id = :id ")
    fun selectNuevaCasa(id : Int) : Flow<NuevaCasa>
}