package com.example.imccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaResult extends AppCompatActivity {

    public TextView resultIMC, txtPadrao;
    private String imc;
    public ImageView imageIMC;
    public Button btnVoltar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_result);

        resultIMC = findViewById(R.id.resultIMC);
        txtPadrao = findViewById(R.id.txtPadrao);
        imageIMC = findViewById(R.id.imageIMC);

        Intent i = getIntent();
        imc = i.getStringExtra("resultIMC");
        resultIMC.setText(String.valueOf(imc));
        ConfirmacaoIMC();
    }

    public void ConfirmacaoIMC () {
        double imcDouble = Double.parseDouble(imc);
        if (imcDouble < 18.5) {
            txtPadrao.setText("Abaixo do peso");
            imageIMC.setImageResource(R.drawable.abaixopeso);
        }
        else if (imcDouble >= 18.5 && imcDouble < 24.9) {
            txtPadrao.setText("Peso normal");
            imageIMC.setImageResource(R.drawable.normal);
        }
        else if (imcDouble >= 25 && imcDouble < 29.9) {
            txtPadrao.setText("Sobrepeso");
            imageIMC.setImageResource(R.drawable.sobrepeso);
        }
        else if (imcDouble >= 30 && imcDouble < 34.9) {
            txtPadrao.setText("Obesidade Grau I");
            imageIMC.setImageResource(R.drawable.obesidade1);
        }
        else if (imcDouble >= 35 && imcDouble < 39.9) {
            txtPadrao.setText("Obesidade Grau II");
            imageIMC.setImageResource(R.drawable.obesidade2);
        }
        else {
            txtPadrao.setText("Obesidade Grau III");
            imageIMC.setImageResource(R.drawable.obesidade3);
        }
    }

    public void VoltarPrincipal(View view) {
        this.finish();
    }
}
