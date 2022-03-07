package com.example.quiz_ace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        Log.i( "info","sign up running");
    }
}