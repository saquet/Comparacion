package com.example.myapplication.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt1.setOnClickListener {
            val ed1 = binding.ed1.text.toString().toString()
            val ed2 = binding.ed2.text.toString().toString()

            viewModel.comprarTextos(ed1, ed2)

        }
        viewModel.resultado.observe(this) { resultado ->
            binding.tv1.text = resultado
        }
    }
}
