package com.mayank.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewUser : AppCompatActivity() {


    lateinit var finame:EditText
    lateinit var laname:EditText
    lateinit var emailid:EditText
    lateinit var phonenum:EditText
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_signup)
        finame = findViewById(R.id.txtfname)
        laname = findViewById(R.id.txtlname)
        emailid = findViewById(R.id.txtmail)
        phonenum = findViewById(R.id.txtpno)
        button3 = findViewById(R.id.button3)

        button3.setOnClickListener() {
            val firstname= finame.text.toString()
            val lastname = laname.text.toString()
            val full = "$firstname $lastname"
            val mymail = emailid.text.toString()
            val mobno = phonenum.text.toString()


            val intent7 = Intent(this@NewUser, DetailActivity::class.java)
            intent7.putExtra("Mydata1", full)
            intent7.putExtra("Mydata2", mymail)
            intent7.putExtra("Mydata3", mobno)


            startActivity(intent7)




        }



    }
}