package com.generation.viewmodelandlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generation.viewmodelandlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
   private lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        /* forma de fazer sem o viewModel
        var cont = 0
        binding.resultado.text = cont.toString()

        binding.button.setOnClickListener {
            cont ++
            binding.resultado.text= cont.toString()

         */
            // com o viewModel
        binding.resultado.text = mainViewModel.cont.toString()
        mainViewModel.cont.observe(this){
            binding.resultado.text = it.toString()
        }
        binding.button.setOnClickListener {
            mainViewModel.addNum()

        }
        }

    }
