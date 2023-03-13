package com.zmei.a18_level

import Constants.constansMain
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.zmei.a18_level.databinding.ActivityMainBinding
import com.zmei.a18_level.databinding.SecondBinding

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
        if (requestCode == constansMain.REQUEST_CODE_SIGN_IN) {
        val l = data?.getStringExtra(constansMain.LOGIN)
        val p = data?.getStringExtra(constansMain.PASSWORD)
        if (login == l && password == p){
            binding.imAvatar.visibility = View.VISIBLE
            binding.imAvatar.setImageResource(avatarImageId)
            val textInfo = "$name $name2 $name3"
            binding.tvInfo.text = textInfo
            binding.buttonSignUp.visibility = View.GONE
            binding.buttonSignIn.text = "Exit"
        } else {binding.imAvatar.visibility = View.VISIBLE
            binding.tvInfo.text = "Такого аккаунта нет"
                binding.imAvatar.setImageResource(R.drawable.stop)}
        } else if (requestCode == constansMain.REQUEST_CODE_SIGN_UP) {
            login = data?.getStringExtra(constansMain.LOGIN)!!
            password = data?.getStringExtra(constansMain.PASSWORD)!!
            name = data?.getStringExtra(constansMain.NAME)!!
            name2 = data?.getStringExtra(constansMain.NAME2)!!
            name3 = data?.getStringExtra(constansMain.NAME3)!!
            avatarImageId = data.getIntExtra(constansMain.AVATAR_ID, 0)
            binding.imAvatar.visibility = View.VISIBLE
            binding.imAvatar.setImageResource(avatarImageId)
            val textInfo = "$name $name2 $name3"
            binding.tvInfo.text = textInfo
            binding.buttonSignUp.visibility = View.GONE
            binding.buttonSignIn.text = "Exit"
        }
    }

    fun onClickSignIn(view: View){
        if (binding.imAvatar.isVisible && binding.tvInfo.text.toString() == "Такого аккаунта нет" ){
            binding.imAvatar.visibility = View.INVISIBLE
            binding.tvInfo.text = ""
            binding.buttonSignUp.visibility = View.VISIBLE
            binding.buttonSignIn.text = getString(R.string.sign_in)
        }
    val intent = Intent(this, Second::class.java)
        intent.putExtra(constansMain.SIGN_STATE, constansMain.SIGN_IN_STATE)
        startActivityForResult(intent, constansMain.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View){
        val intent = Intent(this, Second::class.java)
        intent.putExtra(constansMain.SIGN_STATE, constansMain.SIGN_UP_STATE)
        startActivityForResult(intent, constansMain.REQUEST_CODE_SIGN_UP)

    }
}