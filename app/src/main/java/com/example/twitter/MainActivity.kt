package com.example.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.viewModel=viewModel
        binding.lifecycleOwner=this
        binding.ValidateUser.setOnClickListener(){
            viewModel.getTweet()
            //viewModel.getTweet(binding.textInputEditText.text.toString())
            }
        val rv: RecyclerView = binding.TL
        rv.layoutManager = LinearLayoutManager(this)

        rv.adapter = TLListAdapter(viewModel._Listtweets)



       /* val navController = findNavController(R.id.nav_host) */
        //binding.ValidateUser.setOnClickListener {MyViewModel.getUser() }

    }
/*
    class MainPage : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.activity_main, container, false)
        } */
    }

