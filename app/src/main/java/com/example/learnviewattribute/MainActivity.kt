package com.example.learnviewattribute

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Declare Views
        val textvidew:TextView= findViewById(R.id.textView)
        val edittxt:EditText=findViewById(R.id.editText)
        val mybutton=findViewById<Button>(R.id.clbutton)
        val bugonext=findViewById<Button>(R.id.gonext)
        val mysecondbtn=findViewById<Button>(R.id.goconvertoapp)







        // *Adding Functionlity

//        ** Set Text From Edit Box to TExt Box By Pressing A Button

        mybutton.setOnClickListener(){
            val mytext=edittxt.text
            textvidew.setText(mytext)

//          textvidew.setText
            Toast.makeText(this@MainActivity,"The Button is Clicked",Toast.LENGTH_LONG).show()
        }

//        ** Go To Next Activity by Clicking on A Button
        bugonext.setOnClickListener(){
            val intent=Intent(this,SecondScreen::class.java)
            startActivity(intent)
        }
    //** Go To Unit Converter Activity
        mysecondbtn.setOnClickListener(){
            var intent=Intent(this,UnitConverterActivity::class.java)
            startActivity(intent)
        }


    }
}