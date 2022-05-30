package com.mayank.activitylifecycle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExploringActivity : AppCompatActivity() {
    var titlename : String? = "Admin"
    lateinit var sharedPreferences: SharedPreferences
    lateinit var logoutbt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.layout_exploringsection)
        logoutbt=findViewById(R.id.logoutbt)


            titlename=sharedPreferences.getString("Title","Admin")
            title = titlename
        logoutbt.setOnClickListener{
            sharedPreferences.edit().clear().apply()
            val intent3=Intent(this@ExploringActivity,LoginActivity::class.java)
            startActivity(intent3)
            finish()

        }

    }

}