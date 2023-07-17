package com.itsz.apprepo

import android.app.usage.UsageEvents.Event
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.itsz.apprepo.Service.ApiService
import com.itsz.apprepo.models.request.UserInfoLoginRequest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    val urlBase: String ="http://187.210.77.102/api";


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val myButton = findViewById<Button>(R.id.buttonLogin);
        myButton.setOnClickListener {
            // Llamando a la función suspendida desde el evento de clic

        }
    }
    suspend fun fetchLogin(){
        val retrofit = Retrofit.Builder()
            .baseUrl(urlBase) // URL base de la API
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        // En una función suspend o dentro de un CoroutineScope
        val request = UserInfoLoginRequest()

        request.email = "repositorio_ci@zongolica.tecnm.mx"
        request.password="itsz2023";
        val response = apiService.login(request);
        if (response.isSuccessful) {
            val userinfo = response.body()
            print(userinfo);
            // Hacer algo con los usuarios obtenidos
        } else {
            // Manejar el error de la llamada
        }


    }
    fun openHome(view: View){
        var intent= Intent(this,HomeActivity::class.java)
        startActivity(intent)

    }
}