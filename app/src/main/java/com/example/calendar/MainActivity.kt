package com.example.calendar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    /**
     * Initializes the variables
     */

    lateinit var calendar: Calendar
    lateinit var simpleDateFormat: SimpleDateFormat
    lateinit var date: String
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Display the current date and time using a text box
         */

        title="Calendar"
        textView=findViewById(R.id.dateTextView)
        calendar=Calendar.getInstance()
        simpleDateFormat= SimpleDateFormat("EEE , d MMM yyyy \n\n hh:mm aaa")
        date=simpleDateFormat.format(calendar.time)
        textView.text=date


        /**
         * Using a button to go to the next activity
         */

        val secondActButton=findViewById<Button>(R.id.second_act_btn)
        secondActButton.setOnClickListener {
            val Intent=Intent(this,CalendarScreen::class.java)
            startActivity(Intent)
        }


    }
}