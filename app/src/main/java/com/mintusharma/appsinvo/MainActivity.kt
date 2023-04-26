package com.mintusharma.appsinvo

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mintusharma.appsinvo.databinding.ActivityMainBinding
import com.mintusharma.appsinvo.fragment.HomeFragment
import com.mintusharma.appsinvo.fragment.OtherFragment
import kotlin.collections.indexOfFirst
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() ,
    BottomNavigationView.OnNavigationItemSelectedListener{

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigation.setOnNavigationItemSelectedListener(this)
        binding.bottomNavigation.selectedItemId = R.id.home
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.search-> {
                Toast.makeText(applicationContext, "clicked search", Toast.LENGTH_LONG).show()
                true
            }
            R.id.notification-> {
                Toast.makeText(applicationContext, "clicked notification", Toast.LENGTH_LONG).show()
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }

    @SuppressLint("ResourceType")
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.home -> {
                val homeFragment = HomeFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, homeFragment)
                    .commit()

                binding.fab.setImageResource(R.drawable.vector_smart_object_copy_3_2)
                binding.fab.setColorFilter(Color.WHITE)

                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.home
                layoutParams.anchorGravity = Gravity.CENTER
                binding.fab.layoutParams = layoutParams

                return true
            }
            R.id.myBooking -> {
                val otherFragment = OtherFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, otherFragment)
                    .commit()

                binding.fab.setImageResource(R.drawable.vector_smart_object_5)
                binding.fab.setColorFilter(Color.WHITE)

                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.myBooking
                layoutParams.anchorGravity = Gravity.CENTER
                binding.fab.layoutParams = layoutParams

                return true
            }
            R.id.myQR -> {
                val otherFragment = OtherFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, otherFragment)
                    .commit()

                binding.fab.setImageResource(R.drawable.shape_1)
                binding.fab.setColorFilter(Color.WHITE)

                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.myQR
                layoutParams.anchorGravity = Gravity.CENTER
                binding.fab.layoutParams = layoutParams

                return true
            }
            R.id.scanQr -> {
                val otherFragment = OtherFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, otherFragment)
                    .commit()

                binding.fab.setImageResource(R.drawable.vector_smart_object_8)
                binding.fab.setColorFilter(Color.WHITE)

                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.scanQr
                layoutParams.anchorGravity = Gravity.CENTER
                binding.fab.layoutParams = layoutParams


                return true
            }
            R.id.profile -> {
                val otherFragment = OtherFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.container, otherFragment)
                    .commit()

                binding.fab.setImageResource(R.drawable.ic_profile)
                binding.fab.setColorFilter(Color.WHITE)

                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.bottom_navigation
                layoutParams.anchorGravity = Gravity.END
                binding.fab.layoutParams = layoutParams

                return true
            }
        }
//        val slideAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in)
//        binding.fab.startAnimation(slideAnimation)
        return false
    }

}