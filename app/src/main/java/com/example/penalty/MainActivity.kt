package com.example.penalty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var AB : EditText
    private lateinit var YYY : EditText
    private lateinit var AB1 : EditText
    private lateinit var number : EditText
    private lateinit var check:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AB = findViewById(R.id.AB)
        YYY = findViewById(R.id.YYY)
        AB1 = findViewById(R.id.AB1)
        number = findViewById(R.id.number)
        check = findViewById(R.id.check)

        check.setOnClickListener {
            if(AB.text.toString().length != 2 || AB1.text.toString().length != 2
                || YYY.text.toString().length !=3 || AB.text.toString() == ""
                || AB1.text.toString() == "" || YYY.text.toString() == ""
                || !YYY.text.toString().isDigitsOnly()){
                Toast.makeText(this, "გთხოვთ, სწორად შეიყვანოთ მანქანის ნომერი", Toast.LENGTH_SHORT).show()
            } else if (number.text.toString() == "" || number.text.toString().length != 11 || !number.text.toString().isDigitsOnly()){
                Toast.makeText(this, "გთხოვთ, სწორად შეიყვანოთ პირადი ნომერი", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "თქვენ არ გაქვთ ჯარიმები", Toast.LENGTH_SHORT).show()
            }
        }
    }
}