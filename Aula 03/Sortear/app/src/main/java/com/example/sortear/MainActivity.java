package com.example.sortear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText max, min;
    TextView txtSorteio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMin = findViewById(R.id.min);
        edMax = findViewById(R.id.max);
        txtResultado = findViewById(R.id.txtSorteio);
    }

    public void sorteio (View v) {
        int min = Integer.parseInt(edMin.getText().toString());
        int max = Integer.parseInt(edMax.getText().toString());

        int sorteado = (int) Math.random() * (max - min + 1) + min;
        txtSorteio.setText(Integer.toString(sorteado));
    }
}