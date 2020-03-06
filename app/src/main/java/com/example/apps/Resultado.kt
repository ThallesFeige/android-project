package com.example.apps

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var verResultado = getSharedPreferences("dados", Context.MODE_PRIVATE)
        textoResul.text = "Mercado livre:  ${verResultado.getInt("mercadoLivre", 0)}"

        textoResul.text = intent.getStringExtra("dados")

        intent.setAction(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)

        startActivity(intent);
    }
}
