
package com.example.jarvis

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Hello! I am JARVIS. How can I help you?"
        text.textSize = 22f
        text.setPadding(30, 50, 30, 30)

        setContentView(text)
    }
}
