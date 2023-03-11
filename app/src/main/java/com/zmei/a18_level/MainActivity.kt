package com.zmei.a18_level

import Constants.constansMain
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.a18_level.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0




        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    if(requestCode == constansMain.REQUEST_CODE_SIGN_IN){
    }
    else if(requestCode == constansMain.REQUEST_CODE_SIGN_UP) {
    }


    fun onClickSignIn(view: View){
    val intent = Intent(this, SecondActivityNew::class.java)
        intent.putExtra(constansMain.SIGN_STATE, constansMain.SIGN_IN_STATE)
        startActivityForResult(intent, constansMain.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View){
        val intent = Intent(this, SecondActivityNew::class.java)
        intent.putExtra(constansMain.SIGN_STATE, constansMain.SIGN_UP_STATE)
        startActivityForResult(intent, constansMain.REQUEST_CODE_SIGN_UP)

    }
}