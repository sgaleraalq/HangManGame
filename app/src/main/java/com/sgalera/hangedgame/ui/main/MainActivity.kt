package com.sgalera.hangedgame.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.sgalera.hangedgame.R
import com.sgalera.hangedgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI(){
        navigationDefaultInit()
        initNavigation()
    }

    private fun navigationDefaultInit(){
        val navigationView: BottomNavigationView = findViewById(R.id.navigationBar)
        navigationView.selectedItemId = R.id.gameFragment
    }

    private fun initNavigation(){
//        val navHost = supportFragmentManager.findFragmentById(R.id.navigationBar) as NavHostFragment
//        navController = navHost.navController
//        binding.bottomNavView.setupWithNavController(navController)
    }
}