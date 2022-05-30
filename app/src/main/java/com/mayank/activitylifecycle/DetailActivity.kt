package com.mayank.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
     var detail1 : String? = "Yur Name"
    var detail2 : String? = " email is here "
    var detail3 : String? = " contact "
    lateinit var entry1: TextView
    lateinit var entry2: TextView
    lateinit var entry3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        entry1 = findViewById(R.id.entry1)
        entry2 = findViewById(R.id.entry2)
        entry3 = findViewById(R.id.entry3)

        if(intent != null ){
            detail1 = intent.getStringExtra("Mydata1")
            detail2 = intent.getStringExtra("Mydata2")
            detail3 = intent.getStringExtra("Mydata3")
            entry1.text= detail1
            entry2.text= detail2
            entry3.text= detail3

        }

    }
}