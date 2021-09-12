package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


        Button but_1,but_2,but_3,but_4,but_5,but_6,but_7,but_8,but_9,but_0,but_Add,but_Sub,but_Mul,but_Div,but_calc,but_dec,but_clear;
        EditText ed1;

        float Value1, Value2,result;
        boolean mAddition, mSubtract, Multiplication, mDivision ;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            but_0 = (Button) findViewById(R.id.but_0);
            but_1 = (Button) findViewById(R.id.but_1);
            but_2 = (Button) findViewById(R.id.but_2);
            but_3 = (Button) findViewById(R.id.but_3);
            but_4 = (Button) findViewById(R.id.but_4);
            but_5 = (Button) findViewById(R.id.but_5);
            but_6 = (Button) findViewById(R.id.but_6);
            but_7 = (Button) findViewById(R.id.but_7);
            but_8 = (Button) findViewById(R.id.but_8);
            but_9 = (Button) findViewById(R.id.but_9);
            but_Add = (Button) findViewById(R.id.but_Add);
            but_Div = (Button) findViewById(R.id.but_Div);
            but_Sub = (Button) findViewById(R.id.but_Sub);
            but_Mul = (Button) findViewById(R.id.but_Mul);
            but_calc = (Button) findViewById(R.id.but_calc);
            but_dec = (Button) findViewById(R.id.but_dec);
            but_clear = (Button) findViewById(R.id.but_clear);
            ed1 = (EditText) findViewById(R.id.edText1);

            but_0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"0");
                }
            });

            but_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"1");
                }
            });

            but_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"2");
                }
            });

            but_3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"3");
                }
            });

            but_4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"4");
                }
            });

            but_5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"5");
                }
            });

            but_6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"6");
                }
            });

            but_7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"7");
                }
            });

            but_8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"8");
                }
            });

            but_9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+"9");
                }
            });

            but_dec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ed1.setText(ed1.getText()+".");
                }
            });

            but_Add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Value1 = Float.parseFloat(ed1.getText().toString());
                    mAddition = true;
                    ed1.setText(null);

                }

            });

            but_Sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Value1 = Float.parseFloat(ed1.getText()+"");
                    mSubtract = true ;
                    ed1.setText(null);

                }
            });

            but_Mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Value1 = Float.parseFloat(ed1.getText()+"");
                    Multiplication = true ;
                    ed1.setText(null);

                }
            });

            but_Div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Value1 = Float.parseFloat(ed1.getText()+"");
                    mDivision = true ;
                    ed1.setText(null);
                }
            });

            but_calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Value2 = Float.parseFloat(ed1.getText()+"");

                    if (mAddition == true){

                        ed1.setText (Value1 + Value2 + "");
                        mAddition=false;
                    }


                    if (mSubtract == true){

                        ed1.setText(Value1 - Value2 + "");
                        mSubtract=false;
                    }

                    if (Multiplication == true){
                        ed1.setText(Value1 * Value2+ "");
                        Multiplication=false;
                    }

                    if (mDivision == true){

                        ed1.setText(Value1 / Value2+ "");
                        mDivision=false;
                    }
                }
            });

            but_clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    ed1.setText("");
                }
            });
        }
    }