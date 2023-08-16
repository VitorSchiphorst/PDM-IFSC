package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResultado.findViewsWithText(R.i.txt);
    }

    public void contaClick(View v) {
        i++;
        tvResultado.setText(Integer.toString(i));
    }
}