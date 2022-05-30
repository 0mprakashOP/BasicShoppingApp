package com.mayank.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgotpActiviy : AppCompatActivity() {
    lateinit var txtfnamef :EditText
    lateinit var txtemailf :EditText
    lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotp_activiy)
        txtfnamef=findViewById(R.id.txtfnamef)
        txtemailf=findViewById(R.id.txtemailf)
        button1=findViewById(R.id.button1)

        button1.setOnClickListener(){
            var mobinum = txtfnamef.text.toString()
            var eadd = txtemailf.text.toString()
            val intent=Intent(this@ForgotpActiviy, PasswordReset::class.java)
            intent.putExtra("MESSAGE",mobinum)
            intent.putExtra("MESSAGE2",eadd)
            startActivity(intent)
        }
    }
}