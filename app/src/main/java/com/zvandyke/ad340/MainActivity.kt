package com.zvandyke.ad340

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zipcodeEditText: EditText = findViewById(R.id.zipcoceEditText)
        val enterButton: Button = findViewById(R.id.enterButton)

        enterButton.setOnClickListener()
        {
            val zipcode: String = zipcodeEditText.text.toString()

            if (zipcode.length != 5)
            {
                Toast.makeText(this, R.string.invalidZipcodeLen, Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, zipcode, Toast.LENGTH_SHORT).show()
            }

        }
    }
}