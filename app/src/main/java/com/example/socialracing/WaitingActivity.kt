package com.example.socialracing

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class WaitingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting)

        Handler().postDelayed(Runnable {
            val i = Intent(this@WaitingActivity, RaceTurnActivity::class.java)
            startActivity(i)
        }, 50000)
    }
}