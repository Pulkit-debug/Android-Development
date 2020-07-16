package com.firstapplication.layoutsviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FillEventHistory
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showtoast(view: View) {
        Toast.makeText(this, "You just clicked the Button", Toast.LENGTH_SHORT).show()
    }
}