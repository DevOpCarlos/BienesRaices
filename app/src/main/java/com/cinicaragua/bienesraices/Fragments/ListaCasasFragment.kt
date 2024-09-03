package com.cinicaragua.bienesraices.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cinicaragua.bienesraices.DAOs.CasaDao
import com.cinicaragua.bienesraices.R

class ListaCasasFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_casas, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ListaCasasFragment()
      //  fun selectAllCasa() = ListaCasasFragment()
    }
}