package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val buttoncall=findViewById<Button>(R.id.btncall)
        buttoncall.setOnClickListener {
            val intent=Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("Tel:1111222233")
            startActivity(intent)
        }
    }
}