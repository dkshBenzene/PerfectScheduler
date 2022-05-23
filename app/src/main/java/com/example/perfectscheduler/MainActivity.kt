package com.example.perfectscheduler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //여기에 달력을 넣을 것이다
        val goPlanButton = findViewById<Button>(R.id.go_plan_button)
        goPlanButton.setOnClickListener {
            startActivity(Intent(this, PlanActivity::class.java))
        }
    }
}
