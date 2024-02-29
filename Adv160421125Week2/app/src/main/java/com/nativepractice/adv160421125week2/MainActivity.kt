package com.nativepractice.adv160421125week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.nativepractice.adv160421125week2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = (supportFragmentManager.findFragmentById(R.id.hostFragment) as NavHostFragment).navController
        NavigationUI.setupActionBarWithNavController(this, navController)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}