package com.example.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webVieww.webViewClient = WebViewClient()
        webVieww.settings.javaScriptEnabled = true

        webVieww.loadUrl(intent.getStringExtra("enderecoUrl"))
    }
}
