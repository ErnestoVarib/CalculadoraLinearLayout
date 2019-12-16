package com.example.calculadoralinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView cuadroNums;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnPlus;
    Button btnMinus;
    Button btnDiv;
    Button btnMulti;
    Button btnEqual;
    Button btnLimpiar;
    int primerNum;
    int segundoNum;
    String simbolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMULTI);
        btnDiv = findViewById(R.id.btnDiv);
        cuadroNums = findViewById(R.id.lblNumeros);
        btnEqual = findViewById(R.id.btnEquals);
        btnLimpiar = findViewById(R.id.btnClean);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cuadroNums.setText("");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "0";
                cuadroNums.setText(mostrar);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "1";
                cuadroNums.setText(mostrar);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "2";
                cuadroNums.setText(mostrar);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "3";
                cuadroNums.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "4";
                cuadroNums.setText(mostrar);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "5";
                cuadroNums.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "6";
                cuadroNums.setText(mostrar);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "7";
                cuadroNums.setText(mostrar);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "8";
                cuadroNums.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "9";
                cuadroNums.setText(mostrar);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                mostrar = mostrar + "0";
                cuadroNums.setText(mostrar);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                primerNum = Integer.parseInt(mostrar);
                cuadroNums.setText("");
                simbolo = "+";
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                primerNum = Integer.parseInt(mostrar);
                cuadroNums.setText("");
                simbolo = "-";
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                primerNum = Integer.parseInt(mostrar);
                cuadroNums.setText("");
                simbolo = "x";
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                primerNum = Integer.parseInt(mostrar);
                cuadroNums.setText("");
                simbolo = "/";
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = cuadroNums.getText().toString();
                segundoNum = Integer.parseInt(mostrar);
                int resultado = calculo(segundoNum);
                cuadroNums.setText(Integer.toString(resultado));
            }
        });

    }
    public int calculo(int segundo){
        int result = 0;
        if ( simbolo == "+"){
            result = primerNum + segundo;
        }else  if (simbolo == "-"){
            result = primerNum - segundo;
        }else if (simbolo=="x"){
            result = primerNum * segundo;
        }else if (simbolo =="/"){
            try {
                result = primerNum / segundo;
            }catch (RuntimeException ex){
                result = 0;
            }
        }
        return result;
    }
}