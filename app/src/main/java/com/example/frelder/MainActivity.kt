package com.example.frelder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clMain = findViewById<ConstraintLayout>(R.id.clMain)
        val textview = findViewById<TextView>(R.id. txtTitle)


        swLamp?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked){
                textview.setText("on")
                 clMain.setBackgroundResource(R.color.red)

            }else{
                textview.setText("off")
                clMain.setBackgroundResource(R.color.white)


            }
        })
        textview.setText("hallo test")
    }
}