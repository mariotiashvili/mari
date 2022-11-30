package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val USERNAME = intent.extras?.getString("NAME")
        val NUMBER = intent.extras?.getString("NAMEE")
        var textviewname = findViewById<TextView>(R.id.textView8)
        var textviewnumber = findViewById<TextView>(R.id.textView9)

        textviewname.text = USERNAME
        textviewnumber.text = NUMBER
        if (textviewname.text.isEmpty()){
            textviewname.text="Username not found"
        }
        if(textviewnumber.text.isEmpty()){
            textviewnumber.text = "Number not found"
        }










    }
}