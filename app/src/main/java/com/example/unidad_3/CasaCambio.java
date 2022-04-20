package com.example.unidad_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CasaCambio extends AppCompatActivity {

    EditText editText;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6;
    Button calcular;
    Double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casa_cambio);

        this.editText = findViewById(R.id.editTextNumber);
        this.radioButton1 = findViewById(R.id.RB_usd_dop);
        this.radioButton2 = findViewById(R.id.RB_euro_dop);
        this.radioButton3 = findViewById(R.id.RB_gbp_dop);
        this.radioButton4 = findViewById(R.id.RB_chf_dop);
        this.radioButton5 = findViewById(R.id.BR_bpy_dop);
        this.radioButton6 = findViewById(R.id.BR_hkd_dop);
        this.calcular = findViewById(R.id.BT_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (radioButton1.isChecked()){
                     resultado = 54 * Double.parseDouble(editText.getText().toString());
                     editText.setText(resultado.toString());
                }

                if (radioButton2.isChecked()){
                    resultado = 59 * Double.parseDouble(editText.getText().toString());
                    editText.setText(resultado.toString());
                }

                if (radioButton3.isChecked()){
                    resultado = 71 * Double.parseDouble(editText.getText().toString());
                    editText.setText(resultado.toString());
                }

                if (radioButton4.isChecked()){
                    resultado = 0.43 * Integer.parseInt(editText.getText().toString());
                    editText.setText(resultado.toString());
                }

                if (radioButton5.isChecked()){
                    resultado = 0.43 * Integer.parseInt(editText.getText().toString());
                    editText.setText(resultado.toString());
                }

                if (radioButton6.isChecked()){
                    resultado = 7.01 * Integer.parseInt(editText.getText().toString());
                    editText.setText(resultado.toString());
                }
            }
        });



    }
}