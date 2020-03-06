package com.example.apps

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var verResultado = getSharedPreferences("dados", Context.MODE_PRIVATE)

        var dadosMercadolivre = verResultado.getInt("mercadoLivre", 0);
        var dadosMagalu = verResultado.getInt("lulu", 0);
        var dadosCarrefour = verResultado.getInt("carrefour", 0);
        var dadosAmazon = verResultado.getInt("amazon", 0);
        var dadosAliexpress = verResultado.getInt("aliexpress", 0);

        rbAliexpress.setOnClickListener{
            verResultado.edit().putInt("aliexpress", dadosAliexpress + 1).apply()
            var intent = Intent(this, WebView::class.java)
            startActivity(intent)
        }

        rbMercadolivre.setOnClickListener {

            verResultado.edit().putInt("mercadoLivre", dadosMercadolivre+1).apply()
            var intent = Intent(this, WebView::class.java)
            startActivity(intent)

        }

        rbMagalu.setOnClickListener{
            verResultado.edit().putInt("lulu", dadosMagalu+1).apply()
            var intent = Intent(this, WebView::class.java)
            startActivity(intent)
        }

        rbCarrefour.setOnClickListener{
            verResultado.edit().putInt("carrefour", dadosCarrefour+1).apply()
            var intent = Intent(this, WebView::class.java)
            intent.putExtra("enderecoUrl", "https://www.carrefour.com.br/")
            startActivity(intent)
        }

        rbAmazon.setOnClickListener{
            verResultado.edit().putInt("amazon", dadosAmazon+1).apply()
            var intent = Intent(this, WebView::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{
            var intent = Intent(this, Resultado::class.java)
            startActivity(intent)
        }
    }
}
