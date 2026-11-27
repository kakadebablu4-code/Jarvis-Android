package com.example.jarvis

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(5, 12, 30))
        layout.setPadding(30, 30, 30, 30)

        val title = TextView(this)
        title.text = "J.A.R.V.I.S"
        title.textSize = 34f
        title.setTextColor(Color.CYAN)
        title.gravity = Gravity.CENTER

        val status = TextView(this)
        status.text = "\nSYSTEM ONLINE\n\nYour JARVIS is ready!"
        status.textSize = 20f
        status.setTextColor(Color.GREEN)
        status.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(status)
        setContentView(layout)
    }
}
