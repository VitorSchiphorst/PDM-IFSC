package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import com.example.mvc.Model.Nota;
import com.example.mvc.Model.NotaDAO;

public class MainActivity extends AppCompatActivity {
    EditText notaEditText;
    NotaDAO notaDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notaEditText = findViewById(R.id.editNota);
    }

    public void listarNotas (View v) {
        Intent i = new Intent(this, ListNota.class);
        startActivity(i);
    }

    public void btnInput (View v) {
        Editable inputNota = notaEditText.getText();
        notaDAO.inserirNota((Nota) inputNota);
    }
}