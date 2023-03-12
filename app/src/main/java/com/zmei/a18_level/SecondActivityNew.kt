package com.zmei.a18_level

import Constants.constansMain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.a18_level.databinding.ActivitySecondNewBinding

class SecondActivityNew : AppCompatActivity() {
    lateinit var binding: ActivitySecondNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondNewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val signState = intent.getStringExtra(constansMain.SIGN_STATE)
        if (signState == constansMain.SIGN_IN_STATE){
            binding.buttonAva.visibility = View.INVISIBLE
            binding.edName.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
        }
    }


}