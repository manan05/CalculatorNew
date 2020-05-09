package com.example.calculatornew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnSub,btnMul,btnDiv,btn1,btn2,btn3,btn4,btn5,btn6,
            btn7,btn8,btn9,btn0,btnEqual,btnClear,btnDecimal,btnDummy;
    EditText etResult;

    Float value1,value2;
    Boolean addBoolean = false,subBoolean = false,mulBoolean = false,divBoolean = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etResult = findViewById(R.id.etResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btn0 = findViewById(R.id.btn0);
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
        btnDummy = findViewById(R.id.btnDummy);
        btnDecimal = findViewById(R.id.btnDecimal);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "0") ;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "1") ;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "2") ;
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "3") ;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "4") ;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "5") ;
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "6") ;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "7") ;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "8") ;
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText(etResult.getText() + "9") ;
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText() + ".");
            }
        });

        btnDummy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "NOPE",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etResult.getText().length() == 0){
                    etResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(etResult.getText() + "");
                    addBoolean = true;
                    etResult.setText("");
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etResult.getText().length() == 0){
                    etResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(etResult.getText() + "");
                    subBoolean = true;
                    etResult.setText("");
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etResult.getText().length() == 0){
                    etResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(etResult.getText() + "");
                    mulBoolean = true;
                    etResult.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etResult.getText().length() == 0){
                    etResult.setText("");
                }
                else{
                    value1 = Float.parseFloat(etResult.getText() + "");
                    divBoolean = true;
                    etResult.setText("");
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etResult.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value2 = Float.parseFloat(etResult.getText() + "");

                if(addBoolean == true){
                    etResult.setText(value1 + value2 + "");
                    addBoolean = false;
                }
                else if(subBoolean == true){
                    etResult.setText(value1 - value2 + "");
                    subBoolean = false;
                }
                else if(mulBoolean == true){
                    etResult.setText(value1 * value2 + "");
                    mulBoolean = false;
                }
                else if(divBoolean == true){
                    etResult.setText(value1 / value2 + "");
                    divBoolean = false;
                }
            }
        });
    }
}
