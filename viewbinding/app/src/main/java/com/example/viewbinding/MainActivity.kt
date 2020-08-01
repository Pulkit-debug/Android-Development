package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*   // Here this is the special feature of kotlin and this is called Synthetic Binding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // This particular line is used for content mapping

//        var textView = findViewById<TextView>(R.id.textView);
            textView.text = "10";   // so here we don't have to wrrite the functino everytime I need this textView
        // everytime we have to use this function we don't need to write this line in that case we use something called synthetic Binding

        textView.setTextColor(resources.getColor(R.color.colorAccent)); // we can also use the resources and it will work
        textView.textSize = 100f    // here we use float instead of sp there is convertion in sp from float


        // Always when we have to edit multiple values of same thing then in that case we can use with keyword doing so we don't have to write the name of that again and again
        // or one more way to do it is by using apply function

        textView.apply {
            isVisible = false;
            textSize = 50f
            text = "5"
        }

//        with(textView) {
//            textSize = 50f
//            text = "5"
//        }


        editTextTextPersonName.apply {
            isEnabled = true;  // we can use this property if we don't want anyone to type anything in that box basically just disable that thing
            hint = "Enter Your name"
            setText("pulkit here");
            addTextChangedListener {
                // this method is used to get the values ont the text field dynamically on the go.
                Log.i("ViewBinding", it.toString());
                // this is how we can get what user is typing and do action on acordingly
                if(it.toString() == "pulkit") {
                    Log.i("ViewBinding", "working");
                }

            }
        }


        button.setOnClickListener {
            // This function is a high order function
            Toast.makeText(it.context, "Button is Pressed!", Toast.LENGTH_LONG).show();
        }
    }
}