package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Ciclo de Vida Activity: ", "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.v("Ciclo de Vida Activity: ", "onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.v("Ciclo de Vida Activity: ", "onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.v("Ciclo de Vida Activity: ", "onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.v("Ciclo de Vida Activity: ", "onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

}