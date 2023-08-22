package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    EditText edMax, edMin;
    TextView txtSorteio;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.button);
        edMin = (EditText) findViewById(R.id.min);
        edMax = (EditText) findViewById(R.id.max);
        txtSorteio = (TextView) findViewById(R.id.txtSorteio);
    }

    public void sorteio (View v) {
        int min = Integer.parseInt(String.valueOf(edMin.getText()));
        int max = Integer.parseInt(String.valueOf(edMax.getText()));
        int randomNum = rand.nextInt((max - min) + 1) + min;
        txtSorteio.setText(String.valueOf(randomNum));
    }
}