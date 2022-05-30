package com.mayank.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PasswordReset : AppCompatActivity() {
    var mymess : String? ="hye!!"
    var mymessage : String? = "ufh"
    lateinit var txtpassre : TextView
    lateinit var txtpassre1 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_reset)
        txtpassre=findViewById(R.id.txtpassre)
        txtpassre1=findViewById(R.id.txtpassre1)
        if (intent!= null) {
            mymess =intent.getStringExtra("MESSAGE")
            mymessage = intent.getStringExtra("MESSAGE2")
            txtpassre.text=mymess
            txtpassre1.text=mymessage
        }

    }
}