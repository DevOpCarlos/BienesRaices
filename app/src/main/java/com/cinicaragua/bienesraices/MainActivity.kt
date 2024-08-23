package com.cinicaragua.bienesraices

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.cinicaragua.bienesraices.Adapters.ViewPagerAdapter
import com.cinicaragua.bienesraices.Fragments.AgregarCasaFragment
import com.cinicaragua.bienesraices.Fragments.ListaCasasFragment
import com.cinicaragua.bienesraices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.viewPagerMenu.adapter = ViewPagerAdapter(this)

        binding.viewPagerMenu.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.menuNavegacion.menu.getItem(position).isChecked = true
            }

        })

        binding.menuNavegacion.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.menuLista -> {
                    binding.viewPagerMenu.currentItem = 0
                }

                R.id.menuInsertar -> {
                    binding.viewPagerMenu.currentItem = 1
                }

            }
            true

        }

    }
}