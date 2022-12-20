package com.example.ejercicio4listeners

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio4listeners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var cont=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(){
            cont++
            binding.textView2.text=cont.toString()
        }
        binding.button.setOnClickListener(){
            cont--
            binding.textView2.text=cont.toString()
        }

        binding.editTextTextPersonName3.setOnFocusChangeListener(){_, hasFocus ->
            if(hasFocus){
                binding.button.setBackgroundColor(Color.RED)
                binding.button2.setBackgroundColor(Color.RED)
            }else{
                binding.button.setBackgroundColor(Color.BLUE)
                binding.button2.setBackgroundColor(Color.BLUE)
            }
        }

    }


    }
