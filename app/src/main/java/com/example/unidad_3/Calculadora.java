package com.example.unidad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity  {

    TextView textView;
    EditText editText1;
    EditText editText2;
    Button button1 , button2 ,button3 ,button4 ,button5 ,button6;
    String resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

    this.textView = findViewById(R.id.textView3);
    this.editText1 = findViewById(R.id.fmtext1);
    this.editText2 = findViewById(R.id.fmtext2);
    this.button1.findViewById(R.id.BTsumar);
    this.button2.findViewById(R.id.BTrestar);
    this.button3.findViewById(R.id.BTdividir);
    this.button4.findViewById(R.id.BTmodulo);
    this.button5.findViewById(R.id.BTpotencia);
    this.button6.findViewById(R.id.BTmultiplicar);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


        }
    });
    }

}