package com.example.imccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Calcular, Result;
    private EditText editTextPeso, editTextAltura;
    private TextView txtResult;
    private Double pesoPessoa, alturaPessoa, imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcular = findViewById(R.id.Calcular);
        editTextPeso = findViewById(R.id.editTextPeso);
        editTextAltura = findViewById(R.id.editTextAltura);
    }

    public void calculoIMC (View view) {
        pesoPessoa = Double.parseDouble(editTextPeso.getText().toString());
        alturaPessoa = Double.parseDouble(editTextAltura.getText().toString());
        imc = pesoPessoa / (alturaPessoa * alturaPessoa);
        txtResult.setText(imc.toString());
    }

    public void TelaResult (View view) {
        Intent intent = new Intent(this, TelaResult.class);
        intent.putExtra("resultIMC",imc);
        startActivity(intent);
    }
}