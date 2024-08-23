package com.cinicaragua.bienesraices.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.cinicaragua.bienesraices.Fragments.AgregarCasaFragment
import com.cinicaragua.bienesraices.Fragments.ListaCasasFragment

class ViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {

        return when (position) {

            0 -> ListaCasasFragment()
            1 -> AgregarCasaFragment()
            else -> ListaCasasFragment()

        }

    }

    override fun getItemCount(): Int {
        return 2
    }

}