package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdd=findViewById<Button>(R.id.buttonAdd)
        val buttonSub=findViewById<Button>(R.id.buttonSub)
        val buttonMul=findViewById<Button>(R.id.buttonMul)
        val buttonDiv=findViewById<Button>(R.id.buttonDiv)
        val edtFirstNumber=findViewById<EditText>(R.id.edtFirstNumber)
        val edtSecondNumber=findViewById<EditText>(R.id.edtSecondNumber)
        val tvResult=findViewById<TextView>(R.id.tvResult)

        var result = 0.0

        buttonAdd.setOnClickListener {
            val strN1=edtFirstNumber.text.toString()
            if(strN1.isNullOrBlank()){
                Toast.makeText(this, "You not enter number 1", Toast.LENGTH_SHORT).show()
                edtFirstNumber.requestFocus()
                return@setOnClickListener
            }
            val strN2=edtSecondNumber.text.toString()
            if(strN2.isNullOrBlank()){
                Toast.makeText(this,"You not enter number 2",Toast.LENGTH_SHORT).show()
                edtSecondNumber.requestFocus()
                return@setOnClickListener
            }
             val n1=strN1.toDouble()
             val n2=strN2.toDouble()
            result = n1+n2
            tvResult.text="Result of caculation is $result"

        }
        buttonSub.setOnClickListener {
            val strN1=edtFirstNumber.text.toString()
            if(strN1.isNullOrBlank()){
                Toast.makeText(this, "You not enter number 1", Toast.LENGTH_SHORT).show()
                edtFirstNumber.requestFocus()
                return@setOnClickListener
            }
            val strN2=edtSecondNumber.text.toString()
            if(strN2.isNullOrBlank()){
                Toast.makeText(this,"You not enter number 2",Toast.LENGTH_SHORT).show()
                edtSecondNumber.requestFocus()
                return@setOnClickListener
            }
             val n1=strN1.toDouble()
             val n2=strN2.toDouble()
             result = n1-n2
            tvResult.text="Result of caculation is $result"
        }
        buttonMul.setOnClickListener {
            val strN1=edtFirstNumber.text.toString()
            if(strN1.isNullOrBlank()){
                Toast.makeText(this, "You not enter number 1", Toast.LENGTH_SHORT).show()
                edtFirstNumber.requestFocus()
                return@setOnClickListener
            }
            val strN2=edtSecondNumber.text.toString()
            if(strN2.isNullOrBlank()){
                Toast.makeText(this,"You not enter number 2",Toast.LENGTH_SHORT).show()
                edtSecondNumber.requestFocus()
                return@setOnClickListener
            }
             val n1=strN1.toDouble()
             val n2=strN2.toDouble()
             result = n1 * n2
            tvResult.text="Result of caculation is $result"
        }
        buttonDiv.setOnClickListener {
            val strN1=edtFirstNumber.text.toString()
            if(strN1.isNullOrBlank()){
                Toast.makeText(this, "You not enter number 1", Toast.LENGTH_SHORT).show()
                edtFirstNumber.requestFocus()
                return@setOnClickListener
            }
            val strN2=edtSecondNumber.text.toString()
            if(strN2.isNullOrBlank()){
                Toast.makeText(this,"You not enter number 2",Toast.LENGTH_SHORT).show()
                edtSecondNumber.requestFocus()
                return@setOnClickListener
            }
             val n1=strN1.toDouble()
             val n2=strN2.toDouble()
            if( n2.toDouble() == 0.0){
                Toast.makeText(this,"Number 2 must not as 0",Toast.LENGTH_SHORT).show()
                edtSecondNumber.requestFocus()
                return@setOnClickListener
            }
            result = n1/n2
            tvResult.text="$result"
        }

    }
}