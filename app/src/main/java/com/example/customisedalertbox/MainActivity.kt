package com.example.customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Create a variable of type dialog, dialog is a built in class in kotlin
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton  = findViewById<Button>(R.id.btnClick)

        dialog =  Dialog(this) // For context keyword we always use this
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box)) //we can use the alert box like this

        //Creating variables for the custom dialog xml view
        val buttongood = dialog.findViewById<Button>(R.id.btnGood)
        val buttonfeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        buttongood.setOnClickListener {
            dialog.dismiss()
        }
        buttonfeedback.setOnClickListener {
            // Intent or Toast
        }

        myButton.setOnClickListener {
            dialog.show()
        }
    }
}