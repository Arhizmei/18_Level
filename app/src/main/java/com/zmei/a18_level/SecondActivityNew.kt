package com.zmei.a18_level

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.a18_level.databinding.ActivitySecondNewBinding

class SecondActivityNew : AppCompatActivity() {
    lateinit var binding: ActivitySecondNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondNewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}