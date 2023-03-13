package com.zmei.a18_level

import Constants.constansMain
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.zmei.a18_level.databinding.SecondBinding

class Second : AppCompatActivity() {

    lateinit var binding: SecondBinding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

    signState = intent.getStringExtra(constansMain.SIGN_STATE)!!
    if (signState == constansMain.SIGN_IN_STATE){
        binding.bAva.visibility = View.INVISIBLE
        binding.edName.visibility = View.GONE
        binding.edName2.visibility = View.GONE
        binding.edName3.visibility = View.GONE
    }}

fun onClickDone (view: View){
    if (signState == constansMain.SIGN_UP_STATE){
        val intent = Intent()
        intent.putExtra(constansMain.LOGIN, binding.edLogin.text.toString())
        intent.putExtra(constansMain.PASSWORD, binding.edPass.text.toString())
        intent.putExtra(constansMain.NAME, binding.edName.text.toString())
        intent.putExtra(constansMain.NAME2, binding.edName2.text.toString())
        intent.putExtra(constansMain.NAME3, binding.edName3.text.toString())
       if (binding.imageView.isVisible) intent.putExtra(constansMain.AVATAR_ID, R.drawable.face_one)
        setResult(RESULT_OK, intent)
        finish()
    } else if (signState == constansMain.SIGN_IN_STATE){
        intent.putExtra(constansMain.LOGIN, binding.edLogin.text.toString())
        intent.putExtra(constansMain.PASSWORD, binding.edPass.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}

fun onClickAvatar (view: View) {
    binding.imageView.visibility = View.VISIBLE

}
}