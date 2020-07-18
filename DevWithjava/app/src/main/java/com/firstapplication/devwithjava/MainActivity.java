package com.firstapplication.devwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    public static final String TAG = "webs";

    TextView tvResult;
    EditText et1, et2, weburl;
    Button btnAdd;
    ImageView btnBrowse;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btnAdd = findViewById(R.id.btnAdd);

        weburl = findViewById(R.id.weburl);
        btnBrowse = findViewById(R.id.btnBrowse);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int var1 = Integer.valueOf(et1.getText().toString());
                int var2 = Integer.valueOf(et2.getText().toString());
                int var3 = var1 + var2;
                // behind the scenes mathematics happens with integers but I can only show String on the screen.
                tvResult.setText(String.valueOf(var3));

                // Going from one activity to another activity

                Intent i = new Intent(MainActivity.this, secondMainActivity.class);

                // Transfrring data from one activity to another
                // Here we use HashMap concept
                // we pass key value pair and rmemember the key is always in String
                // to use that we use a function i.putExtra
                i.putExtra("result", var3);
                // function to start the other activity from current activity
                startActivity(i);

            }
        });


        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = weburl.getText().toString();
                // creating an object of uri to parse the url
                Uri uri = Uri.parse(url);
                // here action view is the one which will open the uri
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(i);
                } catch(ActivityNotFoundException e) {
                    Log.e(TAG, "could not open the given url");
                    // this above message is for the developer and the below toast is for the user
                    Toast.makeText(MainActivity.this, "not able to find the app to open given url", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

}