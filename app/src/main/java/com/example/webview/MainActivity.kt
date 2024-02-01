package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webviewvar=findViewById<WebView>(R.id.webview)
        webviewsetup(webviewvar)
    }
    private fun webviewsetup(a:WebView){
        a.webViewClient= WebViewClient()
        a.apply{
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://developer.android.com/develop/ui/views/layout/webapps/webview")

        }
    }
}