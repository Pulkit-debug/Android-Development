package com.firstapplication.devwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.BatchUpdateException;

//public class MainActivity extends AppCompatActivity {
//        public static final String TAG = "BTN";

//    Button btn2;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        // Second method to set onButtonClick is by using onclickListener

        //first we have to create the object of button2 -> above the function
//        btn2 = findViewById(R.id.button2);
//
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "Button Clicked with Second method");
//            }
//        });
//    }
    // First method to set onButtonClick
//    public void onButtonclick(View v) {
//        Log.d(TAG, "Button Clicked");
//
//    }

//}

//    ************************** Webinar 1 ************************

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText et1, et2;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int var1 = Integer.valueOf(et1.getText().toString());
                int var2 = Integer.valueOf(et2.getText().toString());
                int var3 = var1 + var2;
                // behind the scenes mathematics happens with integers but I can only show String on the screen.
                tvResult.setText(String.valueOf(var3));
            }
        });



    }

}