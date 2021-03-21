package com.example.socialracing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CompleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete)



        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent = Intent(this, IndividualStat::class.java)
            startActivity(intent)
        }
    }
}