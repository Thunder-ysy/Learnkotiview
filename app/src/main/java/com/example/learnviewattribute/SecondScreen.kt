package com.example.learnviewattribute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondScreen : AppCompatActivity() {
    var counter:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        // step 2
        val mybutton=findViewById<Button>(R.id.button)
        val results:TextView=findViewById(R.id.textView2)


        // Step 3
       mybutton.setOnClickListener(){
           results.setText(" "+increaseCounter())
       }
    }
    fun increaseCounter():Int {
        counter++
        return counter
    }
}