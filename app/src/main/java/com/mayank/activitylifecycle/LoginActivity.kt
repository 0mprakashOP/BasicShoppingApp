package com.mayank.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.*

class LoginActivity : AppCompatActivity() {


    lateinit var txtphone: EditText
    lateinit var txtpass: EditText
    lateinit var txtbtn: Button
    lateinit var checkbox1: CheckBox
    lateinit var txtnuser: TextView
    lateinit var txtforgotp:TextView

    val phone = "7000517647"
    val phone2 = "7828544419"
    val pass= "123"
    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_login)
        val IsLoggedIn = sharedPreferences.getBoolean("IsLoggedIn",false)
        if(IsLoggedIn){
            val intent=Intent(this@LoginActivity,ExploringActivity::class.java)
            startActivity(intent)
            finish()
        }

        title = "  Login"
        txtphone = findViewById(R.id.txtphone)
        txtpass = findViewById(R.id.txtpass)
        txtbtn = findViewById(R.id.txtbtn)
        txtnuser=findViewById(R.id.nuser)
        txtforgotp=findViewById(R.id.txtforgotp)
        checkbox1=findViewById(R.id.checkbox1)
        checkbox1.setOnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                txtpass.inputType=1
            }else {
                txtpass.inputType=InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }

        }


        txtbtn.setOnClickListener {
            val phoneno = txtphone.text.toString()
            val password = txtpass.text.toString()
            var username = "Admin"
            val intent = Intent(this@LoginActivity,ExploringActivity::class.java)
            if ((phoneno==phone || phoneno==phone2) && password==pass){
                when(phoneno){
                    phone ->  {
                        username="Mayank"
                        savedPreferences(username)
                        startActivity(intent)}
                    phone2 ->  {
                        username="O.P."
                        savedPreferences(username)
                        startActivity(intent)

                    }


                }



            }
            else {
                Toast.makeText(this@LoginActivity, "incorrect credentials", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        txtnuser.setOnClickListener {
            val intent2 = Intent(this@LoginActivity, NewUser::class.java)
            startActivity(intent2)



        }
        txtforgotp.setOnClickListener {
            val intent5 = Intent(this@LoginActivity,ForgotpActiviy::class.java)
            startActivity(intent5)



        }

    }
    override fun onPause() {
        super.onPause()
        finish()
    }
    fun savedPreferences(title: String){
        sharedPreferences.edit().putBoolean("IsLoggedIn",true).apply()
        sharedPreferences.edit().putString("Title",title ).apply()
    }
}