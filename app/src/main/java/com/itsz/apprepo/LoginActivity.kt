package com.itsz.apprepo

import android.app.usage.UsageEvents.Event
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun openHome(view: View){
        var intent= Intent(this,HomeActivity::class.java)
        startActivity(intent)

    }
}