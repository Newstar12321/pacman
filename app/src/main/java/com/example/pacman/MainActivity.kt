package com.example.pacman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//Создание логина
    var login = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Чтение текста со строки ввода
        var inputLogin = findViewById<EditText>(R.id.editTextTextPersonName3)

        findViewById<Button>(R.id.button).setOnClickListener{
            //Сравниваем созданный нами логин с тем, что написали в первой строке
            if (login == inputLogin.text.toString()){
                //Создаем намерение перейти на MainActivity2
                val intent = Intent(this, MainActivity2::class.java)
                //Переходим на MainActivity2
                startActivity(intent)
            }
            else{
                //Создаем всплывающее уведомление
                Toast.makeText(this, "Вы ввели неправильный логин", Toast.LENGTH_LONG)
            }
        }

    }
}