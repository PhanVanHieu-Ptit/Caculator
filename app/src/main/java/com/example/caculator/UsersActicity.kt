package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class UsersActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users_acticity)

        val edtEmail=findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogIn= findViewById<Button>(R.id.btnLogIn)
        val btnRegister=findViewById<Button>(R.id.btnRegister)

        val db=DBHanding(this)
        btnRegister.setOnClickListener {
            var email = edtEmail.text.toString()
            var password = edtPassword.text.toString()
            db.addUser(email,password)
        }
        btnLogIn.setOnClickListener {
            var email = edtEmail.text.toString()
            var password= edtPassword.text.toString()
            var ret = db.getUser(email,password)
            if(ret){
                Toast.makeText(this,"Verified information",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Invalid information",Toast.LENGTH_SHORT).show()
            }
        }
    }
}