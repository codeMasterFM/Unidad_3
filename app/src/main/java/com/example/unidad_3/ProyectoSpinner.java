package com.example.unidad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class ProyectoSpinner extends AppCompatActivity {
   Spinner spinner1;
   int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        this.spinner1 = findViewById(R.id.spinner2);


        String [] opcines = new String[41];

        for (int i =1980; i< 2021;i++){


        opcines[contador] = String.valueOf(i) ;
            contador++;




        }


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,opcines );
        spinner1.setAdapter(adapter);


    }


    public void toast(View view){
        String seleccion = spinner1.getSelectedItem().toString();

        Toast.makeText(this, seleccion, Toast.LENGTH_SHORT).show();
    }
}