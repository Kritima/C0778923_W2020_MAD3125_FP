package com.lambton.c0778923_w2020_mad3125_fp.ui

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.lambton.c0778923_w2020_mad3125_fp.R
import java.io.IOException
import java.nio.charset.StandardCharsets

class AboutUsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val myWebView: WebView = findViewById(R.id.webViewAboutUs)

        val mActionBar = supportActionBar
        mActionBar!!.hide()
        val assetManager = this.assets

        try {
            val inputStream = assetManager.open("aboutus.html")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val content = String(buffer, StandardCharsets.UTF_8)
            Log.d("DATA", content)
            myWebView?.loadData(content, "text/html", "utf-8")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}