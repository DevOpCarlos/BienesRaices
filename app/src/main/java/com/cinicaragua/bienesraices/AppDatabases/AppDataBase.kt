package com.cinicaragua.bienesraices.AppDatabases


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cinicaragua.bienesraices.DAOs.CasaDao
import com.cinicaragua.bienesraices.Entities.NuevaCasa

@Database(entities = [NuevaCasa::class], version = 1)
abstract class AppDataBase: RoomDatabase()  {

        abstract fun CasaDao() : CasaDao

        companion object {

            @Volatile
            private var INSTANCE : AppDataBase ? = null

            fun getDatabase(context : Context) : AppDataBase {

                return INSTANCE ?: synchronized(this) {

                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDataBase::class.java,
                        "AppDataBase"
                    ).build()

                    INSTANCE = instance
                    instance

                }

            }

        }

    }
