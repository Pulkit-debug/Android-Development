package com.firstapplication.makingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        public static final String TAG = "BTN";
        EditText calScreen;
        Button oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn, plusBtn, minusBtn, multiplyBtn, divideBtn, clearBtn, resultBtn;
//        TextView calScreen;
        private Object Integer;
        private double num1;
        private double num2;
        private double addres;
        private double minusres;
        private double multiplyres;
        private double divideres;
        private char currentOp;
//        private boolean addDone = false;
//        private boolean minusDone = false;
//        private boolean multiplyDone = false;
//        private boolean divideDone = false;
        private boolean firstCheck = false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            oneBtn = findViewById(R.id.oneBtn);
            twoBtn = findViewById(R.id.twoBtn);
            threeBtn = findViewById(R.id.threeBtn);
            fourBtn = findViewById(R.id.fourBtn);
            fiveBtn = findViewById(R.id.fiveBtn);
            sixBtn = findViewById(R.id.sixBtn);
            sevenBtn = findViewById(R.id.sevenBtn);
            eightBtn = findViewById(R.id.eightBtn);
            nineBtn = findViewById(R.id.nineBtn);
            zeroBtn = findViewById(R.id.zeroBtn);
            plusBtn = findViewById(R.id.plusBtn);
            minusBtn = findViewById(R.id.minusBtn);
            multiplyBtn = findViewById(R.id.multiplyBtn);
            divideBtn = findViewById(R.id.divideBtn);
            clearBtn = findViewById(R.id.clearBtn);
            resultBtn = findViewById(R.id.resultBtn);
            calScreen = findViewById(R.id.calScreen);


            final View.OnClickListener calListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(v.getId()) {
                        case R.id.oneBtn:
                            calScreen.append("1");
                            break;
                        case R.id.twoBtn:
                            calScreen.append("2");
                            break;
                        case R.id.threeBtn:
                            calScreen.append("3");
                            break;
                        case R.id.fourBtn:
                            calScreen.append("4");
                            break;
                        case R.id.fiveBtn:
                            calScreen.append("5");
                            break;
                        case R.id.sixBtn:
                            calScreen.append("6");
                            break;
                        case R.id.sevenBtn:
                            calScreen.append("7");
                            break;
                        case R.id.eightBtn:
                            calScreen.append("8");
                            break;
                        case R.id.nineBtn:
                            calScreen.append("9");
                            break;
                        case R.id.zeroBtn:
                            calScreen.append("0");
                            break;
                        case R.id.plusBtn:
                            if(!firstCheck) {
                                num1 = Double.parseDouble(calScreen.getText().toString());
                            }
                            currentOp = '+';
                            firstCheck = true;

                            calScreen.setText("");
//                            addDone = true;
                            break;
                        case R.id.minusBtn:
                            if(!firstCheck) {
                                num1 = Double.parseDouble(calScreen.getText().toString());
                            }
                            currentOp = '-';
                            firstCheck = true;
                            calScreen.setText("");
//                            minusDone = true;
                            break;
                        case R.id.multiplyBtn:
                            if(!firstCheck) {
                                num1 = Double.parseDouble(calScreen.getText().toString());
                            }
                            currentOp = '*';
                            firstCheck = true;
                            calScreen.setText("");
//                            multiplyDone = true;
                            break;
                        case R.id.divideBtn:
                            if(!firstCheck) {
                                num1 = Double.parseDouble(calScreen.getText().toString());
                            }
                            currentOp = '/';
                            calScreen.setText("");
//                            divideDone = true;
                            firstCheck = true;
                            break;
                        case R.id.clearBtn:
                            calScreen.setText("");
                            break;
                        case R.id.resultBtn:
                            num2 = Double.parseDouble(calScreen.getText().toString());

                            if(currentOp == '+') {
                                addres = (num1 + num2);
                                addres = Double.parseDouble(String.valueOf(addres));
                                calScreen.setText((int) addres);
                            }
                            else if(currentOp == '-') {
                                minusres = num1 - num2;
                                calScreen.setText((int) minusres);
                            }
                            else if(currentOp == '*') {
                                multiplyres = num1 * num2;
                                calScreen.setText((int) multiplyres);
                            }
                            else if(currentOp == '/') {
                                divideres = num1 / num2;
                                calScreen.setText((int) divideres);
                            }
                            else {
                                calScreen.setText("isEmpty");
                            }

                            break;
                        default:
                            Log.d(TAG, "Button not defined!!");
                            break;
                    }
                }
            };
            oneBtn.setOnClickListener(calListener);
            twoBtn.setOnClickListener(calListener);
            threeBtn.setOnClickListener(calListener);
            fourBtn.setOnClickListener(calListener);
            fiveBtn.setOnClickListener(calListener);
            sixBtn.setOnClickListener(calListener);
            sevenBtn.setOnClickListener(calListener);
            eightBtn.setOnClickListener(calListener);
            nineBtn.setOnClickListener(calListener);
            zeroBtn.setOnClickListener(calListener);
            plusBtn.setOnClickListener(calListener);
            minusBtn.setOnClickListener(calListener);
            multiplyBtn.setOnClickListener(calListener);
            divideBtn.setOnClickListener(calListener);
            clearBtn.setOnClickListener(calListener);
            resultBtn.setOnClickListener(calListener);

        }
    }