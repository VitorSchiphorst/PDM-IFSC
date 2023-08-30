package com.example.imccalculadora;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TelaResult extends AppCompatActivity {

    private TextView resultIMC, txtPadrao;
    private Double imc;
    private ImageView imageIMC;
    private Button btnVoltar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultIMC = findViewById(R.id.resultIMC);
        txtPadrao = findViewById(R.id.txtPadrao);
        imageIMC = findViewById(R.id.imageIMC);

        Intent i = getIntent();
        imc = i.getDoubleExtra("resultIMC", 0);
        resultIMC.setText(String.valueOf(imc));
        CalculandoIMC();
    }

    public void CalculandoIMC () {
        if (imc < 18.5) {
            txtPadrao.setText("Abaixo do peso");
            imageIMC.setImageResource(R.drawable.abaixopeso);
        }
        else if (imc >= 18.5 && imc < 24.9) {
            txtPadrao.setText("Peso normal");
            imageIMC.setImageResource(R.drawable.normal);
        }
        else if (imc >= 25 && imc < 29.9) {
            txtPadrao.setText("Sobrepeso");
            imageIMC.setImageResource(R.drawable.sobrepeso);
        }
        else if (imc >= 30 && imc < 34.9) {
            txtPadrao.setText("Obesidade Grau I");
            imageIMC.setImageResource(R.drawable.obesidade1);
        }
        else if (imc >= 35 && imc < 39.9) {
            txtPadrao.setText("Obesidade Grau II");
            imageIMC.setImageResource(R.drawable.obesidade2);
        }
        else {
            txtPadrao.setText("Obesidade Grau III");
            imageIMC.setImageResource(R.drawable.obesidade3);
        }
    }

    public void voltar () {
        setContentView(R.layout.activity_main);
    }
}
