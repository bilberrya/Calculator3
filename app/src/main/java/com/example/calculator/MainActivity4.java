package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    Button btnNext,btnEq,btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnSin,btnCos,btnTan,btnDot,btnC;
    EditText etNum,etResult;
    String s="";
    double d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        etNum = (EditText) findViewById(R.id.first_num);
        etResult = (EditText) findViewById(R.id.result);
        btnNext = (Button) findViewById(R.id.btn_back);
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
        btnSin = (Button) findViewById(R.id.sym_sin);
        btnSin.setOnClickListener(this);
        btnDot = (Button) findViewById(R.id.sym_dot);
        btnDot.setOnClickListener(this);
        btnCos = (Button) findViewById(R.id.sym_cos);
        btnCos.setOnClickListener(this);
        btnTan = (Button) findViewById(R.id.sym_tan);
        btnTan.setOnClickListener(this);
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
            case R.id.sym_dot:
                s+=".";
                etNum.setText(s);
                break;
            case R.id.sym_sin:
                d = Double.parseDouble(s);
                d = Math.sin(d);
                s = Double.toString(d);
                break;
            case R.id.sym_cos:
                d= Double.parseDouble(s);
                d = Math.cos(d);
                s = Double.toString(d);
                break;
            case R.id.sym_tan:
                d= Double.parseDouble(s);
                d = Math.tan(d);
                s = Double.toString(d);
                break;
            case R.id.sym_C:
                etResult.setText("");
                etNum.setText("");
                s="";
                break;
            case R.id.sym_equal:
                etResult.setText(s);
                etNum.setText("");
                s="";
                break;
            case R.id.btn_back:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}