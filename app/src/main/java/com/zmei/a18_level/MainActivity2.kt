package com.zmei.a18_level

import Constants.constansMain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.a18_level.databinding.ActivityMain2Binding
import com.zmei.a18_level.databinding.ActivitySecondNewBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        signState = intent.getStringExtra(constansMain.SIGN_STATE)!!
        if (signState == constansMain.SIGN_IN_STATE){
            binding.buttonAva2.visibility = View.INVISIBLE
            binding.edName6.visibility = View.GONE
            binding.edName5.visibility = View.GONE
            binding.edName4.visibility = View.GONE
        }}

    fun onClickDone (view: View){
        if (signState == constansMain.SIGN_IN_STATE){

        }}

    fun onClickAvatar (view: View) {
        binding.imageView2.visibility = View.VISIBLE

    }
}