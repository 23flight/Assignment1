package com.egli.assignment1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1: ImageView = findViewById(R.id.image1)
        val image2: ImageView = findViewById(R.id.image2)
        val image3: ImageView = findViewById(R.id.image3)
        val image4: ImageView = findViewById(R.id.image4)

        val messageText: TextView = findViewById(R.id.messageText)
        val resetButton: Button = findViewById(R.id.resetButton)
        val centerText: TextView = findViewById(R.id.centerText) // Reference to centerText

        // Handle clicks on image1 (Jupiter)
        image1.setOnClickListener {
            messageText.text = "Congrats! You just clicked on Jupiter"
            centerText.text = "" // Clear the center text
            resetButton.visibility = View.VISIBLE
        }

        // Handle clicks on image2 (Neptune)
        image2.setOnClickListener {
            messageText.text = "Congrats! You just clicked on Neptune"
            centerText.text = "" // Clear the center text
            resetButton.visibility = View.VISIBLE
        }

        // Handle clicks on image3 (Saturn)
        image3.setOnClickListener {
            messageText.text = "Congrats! You just clicked on Saturn"
            centerText.text = "" // Clear the center text
            resetButton.visibility = View.VISIBLE
        }

        // Handle clicks on image4 (Venus)
        image4.setOnClickListener {
            messageText.text = "Congrats! You just clicked on Venus"
            centerText.text = "" // Clear the center text
            resetButton.visibility = View.VISIBLE
        }

        // Reset the message and hide the reset button
        resetButton.setOnClickListener {
            messageText.text = ""
            centerText.text = "Click to discover one of the planets!"
            resetButton.visibility = View.GONE
        }
    }
}