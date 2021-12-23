package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edFirstNum, edSecondNum, edRezult;
    Button btnNext, btnBack,btnC, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnEq, btnDot, btnSum, btnRaz, btnYmn, btnDel;
    boolean fnum = true;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBack = (Button) findViewById(R.id.btn_back2);
        edFirstNum = (EditText) findViewById(R.id.first_num);
        edSecondNum = (EditText) findViewById(R.id.second_num);
        edRezult = (EditText) findViewById(R.id.result);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);
        btnC = (Button) findViewById(R.id.sym_C);
        btnC.setOnClickListener(this);
        btnOne = (Button) findViewById(R.id.num1);
        btnOne.setOnClickListener(this);
        btnTwo = (Button) findViewById(R.id.num2);
        btnTwo.setOnClickListener(this);
        btnThree = (Button) findViewById(R.id.num3);
        btnThree.setOnClickListener(this);
        btnFour = (Button) findViewById(R.id.num4);
        btnFour.setOnClickListener(this);
        btnFive = (Button) findViewById(R.id.num5);
        btnFive.setOnClickListener(this);
        btnSix = (Button) findViewById(R.id.num6);
        btnSix.setOnClickListener(this);
        btnSeven = (Button) findViewById(R.id.num7);
        btnSeven.setOnClickListener(this);
        btnEight = (Button) findViewById(R.id.num8);
        btnEight.setOnClickListener(this);
        btnNine = (Button) findViewById(R.id.num9);
        btnNine.setOnClickListener(this);
        btnZero = (Button) findViewById(R.id.num0);
        btnZero.setOnClickListener(this);
        btnEq = (Button) findViewById(R.id.sym_equal);
        btnEq.setOnClickListener(this);
        btnSum = (Button) findViewById(R.id.sym_plus);
        btnSum.setOnClickListener(this);
        btnRaz = (Button) findViewById(R.id.sym_minus);
        btnRaz.setOnClickListener(this);
        btnYmn = (Button) findViewById(R.id.sym_ymn);
        btnYmn.setOnClickListener(this);
        btnDel = (Button) findViewById(R.id.sym_del);
        btnDel.setOnClickListener(this);
        btnDot = (Button) findViewById(R.id.sym_dot2);
        btnDot.setOnClickListener(this);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
        @Override
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.num1:
                    if (fnum) {
                        edFirstNum.append("1");
                    } else {
                        edSecondNum.append("1");
                    }
                    break;
                case R.id.num2:
                    if (fnum) {
                        edFirstNum.append("2");
                    } else {
                        edSecondNum.append("2");
                    }
                    break;
                case R.id.num3:
                    if (fnum) {
                        edFirstNum.append("3");
                    } else {
                        edSecondNum.append("3");
                    }
                    break;
                case R.id.num4:
                    if (fnum) {
                        edFirstNum.append("4");
                    } else {
                        edSecondNum.append("4");
                    }
                    break;
                case R.id.num5:
                    if (fnum) {
                        edFirstNum.append("5");
                    } else {
                        edSecondNum.append("5");
                    }
                    break;

                case R.id.num6:
                    if (fnum) {
                        edFirstNum.append("6");
                    } else {
                        edSecondNum.append("6");
                    }
                    break;
                case R.id.num7:
                    if (fnum) {
                        edFirstNum.append("7");
                    } else {
                        edSecondNum.append("7");
                    }
                    break;
                case R.id.num8:
                    if (fnum) {
                        edFirstNum.append("8");
                    } else {
                        edSecondNum.append("8");
                    }
                    break;
                case R.id.num9:
                    if (fnum) {
                        edFirstNum.append("9");
                    } else {
                        edSecondNum.append("9");
                    }
                    break;
                case R.id.num0:
                    if (fnum) {
                        edFirstNum.append("0");
                    } else {
                        edSecondNum.append("0");
                    }
                    break;
                case R.id.sym_dot2:
                    if (fnum) {
                        edFirstNum.append(".");
                    } else {
                        edSecondNum.append(".");
                    }
                    break;

                case R.id.sym_del:
                    if (fnum)
                        fnum = !fnum;
                    i = 3;
                    break;
                case R.id.sym_plus:
                    if (fnum)
                        fnum = !fnum;
                    i = 0;
                    break;
                case R.id.sym_minus:
                    if (fnum)
                        fnum = !fnum;
                    i = 1;
                    break;
                case R.id.sym_ymn:
                    if (fnum)
                        fnum = !fnum;
                    i = 2;
                    break;
                case R.id.sym_equal:
                    Float ff = 11.3F;
                    if (i == 0)
                        ff = Float.valueOf(edFirstNum.getText().toString()) + Float.valueOf(edSecondNum.getText().toString());
                    if (i == 1)
                        ff = Float.valueOf(edFirstNum.getText().toString()) - Float.valueOf(edSecondNum.getText().toString());
                    if (i == 2)
                        ff = Float.valueOf(edFirstNum.getText().toString()) * Float.valueOf(edSecondNum.getText().toString());
                    if (i == 3)
                        ff = Float.valueOf(edFirstNum.getText().toString()) / Float.valueOf(edSecondNum.getText().toString());
                    edRezult.setText(ff.toString());
                    break;
                case R.id.sym_C:
                    edFirstNum.setText("");
                    edSecondNum.setText("");
                    edRezult.setText("");
                    fnum = true;
                    break;
            }
        }
    }