package com.example.calculatornew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnSub,btnMul,btnDiv,btn1,btn2,btn3,btn4,btn5,btn6,
            btn7,btn8,btn9,btn0,btnEqual,btnClear,btnDecimal,btn00;
    TextView tvResult;

    Float value1,value2;
    Boolean addBoolean = false,subBoolean = false,mulBoolean = false,divBoolean = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvUserResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSubtract);
        btnMul = findViewById(R.id.btnMultiply);
        btnDiv = findViewById(R.id.btnDivide);
        btn0 = findViewById(R.id.btn0);
        btn00 = findViewById(R.id.btn00);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);

        btnDecimal = findViewById(R.id.btnDecimal);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "0") ;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "1") ;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "2") ;
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "3") ;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "4") ;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "5") ;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "6") ;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "7") ;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "8") ;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText(tvResult.getText() + "9") ;
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + ".");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText(tvResult.getText() + "00");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvResult.getText().length() == 0){
                    tvResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(tvResult.getText() + "");
                    addBoolean = true;
                    tvResult.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvResult.getText().length() == 0){
                    tvResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(tvResult.getText() + "");
                    subBoolean = true;
                    tvResult.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvResult.getText().length() == 0){
                    tvResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(tvResult.getText() + "");
                    mulBoolean = true;
                    tvResult.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvResult.getText().length() == 0){
                    tvResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(tvResult.getText() + "");
                    divBoolean = true;
                    tvResult.setText("");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value2 = Float.parseFloat(tvResult.getText() + "");

                if(addBoolean == true){
                    tvResult.setText(value1 + value2 + "");
                    addBoolean = false;
                }
                else if(subBoolean == true){
                    tvResult.setText(value1 - value2 + "");
                    subBoolean = false;
                }
                else if(mulBoolean == true){
                    tvResult.setText(value1 * value2 + "");
                    mulBoolean = false;
                }
                else if(divBoolean == true){
                    tvResult.setText(value1 / value2 + "");
                    divBoolean = false;
                }
            }
        });
    }
}
