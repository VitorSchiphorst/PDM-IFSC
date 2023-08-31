package com.example.imccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button btnCalcular;
    public EditText editTextPeso, editTextAltura;
    public Double pesoPessoa, alturaPessoa;
    public String imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
    }

    public void calculoIMC (View view) {
        pesoPessoa = Double.parseDouble(editTextPeso.getText().toString());
        alturaPessoa = Double.parseDouble(editTextAltura.getText().toString());
        imc = String.valueOf(pesoPessoa / (alturaPessoa * alturaPessoa));
        Intent resultadoIMC = new Intent(this, TelaResult.class);
        resultadoIMC.putExtra("resultIMC", imc);
        startActivity(resultadoIMC);
    }
}