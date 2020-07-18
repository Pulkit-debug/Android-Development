package com.firstapplication.devwithjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondMainActivity extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        tvResult = findViewById(R.id.tvResult);
    // here we create a Intent to get the data from the other activity
        Intent intentThatStartedThis = getIntent();
        // gettting the reuslt from the other activity
        // name(key) must be same
        int result = intentThatStartedThis.getIntExtra("result", 0);
        tvResult.setText(String.valueOf(result));
    }
}