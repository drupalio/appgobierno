package com.example.gobierno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class rfc extends AppCompatActivity {

    Button buttonAceptar;
    Spinner spinnerAnio;
    Spinner spinnerMes;
    Spinner spinnerDia;
    TextView textViewAnio;
    TextView textViewMes;
    TextView textViewDia;
    ArrayList arrayListAnio = new ArrayList();
    ArrayAdapter Adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rfc);
        spinnerMes = (Spinner)findViewById(R.id.spinnerMes);
        spinnerDia = (Spinner)findViewById(R.id.spinnerDia);
        for(int i=2020; i>1900; i--){
            arrayListAnio.add(i+"");
        }
        Adaptador=new ArrayAdapter((getBaseContext()), android.R.layout.simple_spinner_item,arrayListAnio);
        spinnerAnio = (Spinner)findViewById(R.id.spinnerAnio);
        textViewAnio = (TextView) findViewById(R.id.textViewAnio);
        buttonAceptar = (Button) findViewById(R.id.buttonAceptar);



        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewAnio.setText(spinnerAnio.getSelectedItem()+"");
            }
        });

    }
}
