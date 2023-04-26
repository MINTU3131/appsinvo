package com.mintusharma.appsinvo

import android.annotation.SuppressLint
import android.content.Context
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
//                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
//                layoutParams.anchorId = R.id.bottomAppBar
//                layoutParams.anchorGravity = Gravity.CENTER or Gravity.CENTER
//                layoutParams.gravity = Gravity.CENTER or Gravity.CENTER
////                layoutParams.bottomMargin = resources.getDimension(55).toInt()
//                binding.fab.layoutParams = layoutParams
//
//                binding.fab.animate()
//                    .translationX(calculateMenuItemDistance(this,binding.bottomNavigation.selectedItemId,R.id.home))
//                    .setDuration(300)
//                    .start()
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
//                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
//                layoutParams.anchorId = R.id.bottomAppBar
//                layoutParams.anchorGravity = Gravity.START or Gravity.CENTER
//                layoutParams.gravity = Gravity.START or Gravity.CENTER
////                layoutParams.bottomMargin = resources.getDimension(55).toInt()
//                binding.fab.layoutParams = layoutParams
//
//                binding.fab.animate()
//                    .translationX(calculateMenuItemDistance(this,binding.bottomNavigation.selectedItemId,R.id.myBooking))
//                    .setDuration(300)
//                    .start()
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
//                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
//                layoutParams.anchorId = R.id.bottomAppBar
//                layoutParams.anchorGravity = Gravity.RIGHT or Gravity.CENTER
//                layoutParams.gravity = Gravity.RIGHT or Gravity.CENTER
////                layoutParams.bottomMargin = resources.getDimension(R.dimen.fab_right_margin).toInt()
//                binding.fab.layoutParams = layoutParams
//
//                binding.fab.animate()
//                    .translationX(calculateMenuItemDistance(this,binding.bottomNavigation.selectedItemId,R.id.myQR))
//                    .setDuration(300)
//                    .start()
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
//                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
//                layoutParams.anchorId = R.id.bottomAppBar
//                layoutParams.anchorGravity = Gravity.START or Gravity.CENTER
//                layoutParams.gravity = Gravity.START or Gravity.CENTER
////                layoutParams.bottomMargin = resources.getDimension(R.dimen.fab_left_margin).toInt()
//                binding.fab.layoutParams = layoutParams
//
//                binding.fab.animate()
//                    .translationX(calculateMenuItemDistance(this,binding.bottomNavigation.selectedItemId,R.id.scanQr))
//                    .setDuration(300)
//                    .start()
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
//                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
//                layoutParams.anchorId = R.id.bottomAppBar
//                layoutParams.anchorGravity = Gravity.END or Gravity.CENTER
//                layoutParams.gravity = Gravity.END or Gravity.CENTER
////                layoutParams.bottomMargin = resources.getDimension(55).toInt()
//                binding.fab.layoutParams = layoutParams
//
//                binding.fab.animate()
//                    .translationX(calculateMenuItemDistance(this,binding.bottomNavigation.selectedItemId,R.id.profile))
//                    .setDuration(300)
//                    .start()
                val layoutParams = binding.fab.layoutParams as CoordinatorLayout.LayoutParams
                layoutParams.anchorId = R.id.profile
                layoutParams.anchorGravity = Gravity.RIGHT or Gravity.CENTER_VERTICAL
                layoutParams.rightMargin = resources.getDimensionPixelSize(R.dimen.fab_right_margin)
                binding.fab.layoutParams = layoutParams
//                positionFab(binding.bottomNavigation.selectedItemId)

                return true
            }
        }
        val slideAnimation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_in)
        binding.fab.startAnimation(slideAnimation)
        return false
    }

    fun calculateMenuItemDistance(context: Context, item1Id: Int, item2Id: Int): Float {
        val item1 = findViewById<View>(item1Id)
        val item2 = findViewById<View>(item2Id)

        val location1 = IntArray(2)
        item1.getLocationOnScreen(location1)
        val x1 = location1[0].toFloat()
        val y1 = location1[1].toFloat()

        val location2 = IntArray(2)
        item2.getLocationOnScreen(location2)
        val x2 = location2[0].toFloat()
        val y2 = location2[1].toFloat()

        val deltaX = x2 - x1
        val deltaY = y2 - y1

        return sqrt(deltaX.pow(2) + deltaY.pow(2))
    }

//    private fun positionFab(selectedItemId: Int) {
//        val menu = binding.bottomNavigation.menu
//        val menuItemView = menu.findItem(selectedItemId)?.let { menuItem ->
//            binding.bottomNavigation.findViewById<View>(menuItem.itemId)
//        }
//
//        val menuWidth = binding.bottomNavigation.width
//        val fabWidth = binding.fab.width
//        val halfFabWidth = fabWidth / 2
//
//        menuItemView?.let { view ->
//            // Calculate the center of the selected menu item
//            val centerX = view.left + view.width / 2
//
//            // Calculate the translationX value to position the FAB at the center of the menu item
//            val translationX = centerX - halfFabWidth
//
//            // Set the translationX value to the FAB
//            binding.fab.translationX = translationX.toFloat()
//        }
//
//        // If the last menu item is selected, position the FAB at the end of the menu bar
//        if (selectedItemId == menu.last().itemId) {
//            binding.fab.translationX = (menuWidth - fabWidth).toFloat()
//        }
//    }

}