package com.example.gobierno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButtonRFC, radioButtonCurp, radioButtonPlacas, radioButtonSalir;
    Button buttonAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButtonRFC = (RadioButton)findViewById(R.id.radioButtonRFC);
        radioButtonCurp = (RadioButton)findViewById(R.id.radioButtonCurp);
        radioButtonPlacas = (RadioButton)findViewById(R.id.radioButtonPlacas);
        radioButtonSalir = (RadioButton)findViewById(R.id.radioButtonSalir);
        buttonAceptar = (Button)findViewById(R.id.buttonAceptar);
        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButtonRFC.isChecked()) {
                    Intent cambioVentana = new Intent(MainActivity.this, rfc.class);
                    startActivity(cambioVentana);
                }else if(radioButtonCurp.isChecked()){
                    Intent cambioV = new Intent(MainActivity.this, curp.class);
                    startActivity(cambioV);
                }else if(radioButtonPlacas.isChecked()){
                    Intent cambioV = new Intent(MainActivity.this, placas.class);
                    startActivity(cambioV);
                }else if(radioButtonSalir.isChecked()){
                    finish();
                }
                }
        });


    }
}
