package com.example.imccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ImgFoto;
    Integer imagens[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagens = new Integer[] (R.drawable.abaixopeso, R.drawable.obesidade1, R.drawable.obesidade2, R.drawable.obesidade3, R.drawable.normal, R.drawable.perfil, R.drawable.sobrepeso);

    }
}