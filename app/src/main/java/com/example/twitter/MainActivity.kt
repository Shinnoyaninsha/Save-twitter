package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter.databinding.ActivityMainBinding
import com.example.twitter.ui.main.MainFragment
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.viewModel=viewModel
        val rv: RecyclerView = findViewById(R.id.TL)
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = TLListAdapter(IntRange(0,100).toList()
    }


        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        val navController = findNavController(R.id.nav_host) */
        //binding.ValidateUser.setOnClickListener {MyViewModel.getUser() }

    }
/*
    class MainPage : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.activity_main, container, false)
        }
    } */

