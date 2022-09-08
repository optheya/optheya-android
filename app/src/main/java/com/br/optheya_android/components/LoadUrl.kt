package com.br.optheya_android.components

import android.content.Context
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun LoadUrl(url: String, context: Context) {

    AndroidView(factory = {
        WebView(context).apply {
            webViewClient = WebViewClient()

            loadUrl(url)
        }
    })
}