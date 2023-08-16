package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvContador;
    Button click;
    Integer i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click = findViewById(R.id.button2);
        tvContador = findViewById(R.id.tvContador);
    }

    public void contagem(View v) {
        i++;
        tvContador.setText(Integer.toString(i));
    }
}