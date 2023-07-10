package com.example.learnviewattribute


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class UnitConverterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_converter)
        val mysett=findViewById<TextView>(R.id.textconvert)
        val edt: EditText= findViewById(R.id.editmyco)
        val btn = findViewById<Button>(R.id.button2)



        btn.setOnClickListener() {
            val mytes:Double=edt.text.toString().toDouble()

            mysett.setText(" "+converttofp(mytes))


        }
    }

    fun converttofp(kilos: Double): Double {
        var pountd=kilos*2.20462
        return pountd
    }
}


