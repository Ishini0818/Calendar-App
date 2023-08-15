package com.example.calendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_screen)

        /**
         * Using a button to go to the main activity
         */

        val secondActButton=findViewById<Button>(R.id.back_btn)
        secondActButton.setOnClickListener {
            val Intent= Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}