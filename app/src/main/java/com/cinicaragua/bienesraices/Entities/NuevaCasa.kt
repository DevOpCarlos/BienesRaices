package com.cinicaragua.bienesraices.Entities

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class NuevaCasa(
    @PrimaryKey
    var id : Int?,

    @ColumnInfo(name = "Direccion")
    var Direccion : String,

    @ColumnInfo(name = "Precio")
    var Precio : Float,

    @ColumnInfo(name = "Descripcion")
    var Descripcion : String,

    @ColumnInfo(name = "NHabitacion")
    var Nhabitacionn : Int,

    @ColumnInfo(name = "NBanos")
    var NBanos : Int,

    @ColumnInfo(name = "Superficie")
    var Superficie : Int,

    @ColumnInfo(name = "Imagenes")
    var Imagenes : String,

    )
