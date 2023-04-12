package com.example.simple_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txt_display_answer:TextView
    private lateinit var edtFirst:EditText
    private lateinit var edtSecond:EditText
    private lateinit var add_button:Button
    private lateinit var multiply_button:Button
    private lateinit var subtract_button:Button
    private lateinit var divide_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instantiate variables
        txt_display_answer = findViewById(R.id.txtanswer)
        edtFirst = findViewById(R.id.edtfirstnumber)
        edtSecond = findViewById(R.id.edtsecondnumber)
        add_button = findViewById(R.id.btnAdd)
        multiply_button = findViewById(R.id.btnmultiply)
        subtract_button = findViewById(R.id.btnsubtract)
        divide_button = findViewById(R.id.btndivide)

        add_button.setOnClickListener{

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{

                var answer = first_num.toDouble() + second_num.toDouble()
                txt_display_answer.text = answer.toString()
                //Toast.makeText(this, "Trying to add two numbers", Toast.LENGTH_SHORT).show()
            }

        //Toast.makeText(this, "Trying to add", Toast.LENGTH_SHORT).show()
        }

        multiply_button.setOnClickListener{

            var first_number = edtFirst.text.toString().trim()
            var second_number = edtSecond.text.toString().trim()

            //user validation
            if (first_number.isEmpty() || second_number.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{

                var ans = first_number.toDouble() * second_number.toDouble()
                txt_display_answer.text = ans.toString()
                //Toast.makeText(this, "Trying to multiply two numbers", Toast.LENGTH_SHORT).show()
            }

            //Toast.makeText(this, "Trying to add", Toast.LENGTH_SHORT).show()
        }

        divide_button.setOnClickListener{

            var first_number = edtFirst.text.toString().trim()
            var second_number = edtSecond.text.toString().trim()

            //user validation
            if (first_number.isEmpty() || second_number.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{

                var ans = first_number.toDouble() / second_number.toDouble()
                txt_display_answer.text = ans.toString()
                //Toast.makeText(this, "Trying to multiply two numbers", Toast.LENGTH_SHORT).show()
            }

            //Toast.makeText(this, "Trying to add", Toast.LENGTH_SHORT).show()
        }

        subtract_button.setOnClickListener{

            var first_number = edtFirst.text.toString().trim()
            var second_number = edtSecond.text.toString().trim()

            //user validation
            if (first_number.isEmpty() || second_number.isEmpty()){
                Toast.makeText(this, "PLEASE ENTER A NUMBER", Toast.LENGTH_SHORT).show()
            }
            else{

                var ans = first_number.toDouble() - second_number.toDouble()
                txt_display_answer.text = ans.toString()
                //Toast.makeText(this, "Trying to multiply two numbers", Toast.LENGTH_SHORT).show()
            }

            //Toast.makeText(this, "Trying to add", Toast.LENGTH_SHORT).show()
        }

    }
}