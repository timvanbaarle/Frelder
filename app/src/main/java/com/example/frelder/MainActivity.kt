package com.example.frelder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clMain = findViewById<ConstraintLayout>(R.id.cMain)
        val textview = findViewById<TextView>(R.id.txtTitle)

        fun onButtonClick(view: View) {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


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
