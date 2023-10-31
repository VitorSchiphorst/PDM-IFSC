package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase sqlite;
    ListView btn, btnListar;
    ListView nomeEditText, idadeEditText;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btnListar = findViewById(R.id.btnLista);
        nomeEditText = findViewById(R.id.editTextNome);
        idadeEditText = findViewById(R.id.editTextIdade);

        sqlite = openOrCreateDatabase("db", MODE_PRIVATE, null);
        sqlite.execSQL("CREATE TABLE IF NOT EXISTS usr (id INTEGER PRIMARY KEY AUTOINCREMENT," + " digitado VARCHAR ," + " idade INTEGER);");
    }

    @SuppressLint("Range")
    public void btnInput (View v) {
        String EditTextNome = nomeEditText.getText();
        String EditTextIdade = nomeEditText.getText().toString();
        ContentValues cv = new ContentValues();
        cv.put("digitado", EditTextNome);
        cv.put("idade", EditTextIdade);
        sqlite.insert("usr", null, cv);
    }

    @SuppressLint("Range")
    public void listar(View v) {
        Intent i = new Intent(this, list.class);
        startActivity(i);
    }
}