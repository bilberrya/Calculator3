package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    Button btnNext,btnC,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnEq,btnDot,btnSqrt,btnExp,btnPow,btnCbrt;
    EditText etNum,etResult;
    String s="";
    double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etNum = (EditText) findViewById(R.id.first_num);
        etResult = (EditText) findViewById(R.id.result);
        btnC = (Button) findViewById(R.id.sym_C);
        btnC.setOnClickListener(this);
        btnNext = (Button) findViewById(R.id.btn_next2);
        btnNext.setOnClickListener(this);
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
        btnDot = (Button) findViewById(R.id.sym_dot3);
        btnDot.setOnClickListener(this);
        btnSqrt = (Button) findViewById(R.id.sym_sqrt);
        btnSqrt.setOnClickListener(this);
        btnExp = (Button) findViewById(R.id.sym_exp);
        btnExp.setOnClickListener(this);
        btnPow = (Button) findViewById(R.id.sym_pow);
        btnPow.setOnClickListener(this);
        btnCbrt = (Button) findViewById(R.id.sym_cbrt);
        btnCbrt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.num1:
                s+="1";
                etNum.setText(s);
                break;
            case R.id.num2:
                s+="2";
                etNum.setText(s);
                break;
            case R.id.num3:
                s+="3";
                etNum.setText(s);
                break;
            case R.id.num4:
                s+="4";
                etNum.setText(s);
                break;
            case R.id.num5:
                s+="5";
                etNum.setText(s);
                break;
            case R.id.num6:
                s+="6";
                etNum.setText(s);
                break;
            case R.id.num7:
                s+="7";
                etNum.setText(s);
                break;
            case R.id.num8:
                s+="8";
                etNum.setText(s);
                break;
            case R.id.num9:
                s+="9";
                etNum.setText(s);
                break;
            case R.id.num0:
                s+="0";
                etNum.setText(s);
                break;
            case R.id.sym_dot3:
                s+=".";
                etNum.setText(s);
                break;
            case R.id.sym_sqrt:
                d = Double.parseDouble(s);
                d = Math.sqrt(d);
                s = Double.toString(d);
                break;
            case R.id.sym_cbrt:
                d= Double.parseDouble(s);
                d = Math.cbrt(d);
                s = Double.toString(d);
                break;
            case R.id.sym_exp:
                d= Double.parseDouble(s);
                d = Math.exp(d);
                s = Double.toString(d);
                break;
            case R.id.sym_pow:
                d= Double.parseDouble(s);
                d *=d;
                s = Double.toString(d);
                break;
            case R.id.sym_equal:
                etResult.setText(s);
                etNum.setText("");
                s="";
                break;
            case R.id.sym_C:
                etResult.setText("");
                etNum.setText("");
                s="";
                break;
            case R.id.btn_next2:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}