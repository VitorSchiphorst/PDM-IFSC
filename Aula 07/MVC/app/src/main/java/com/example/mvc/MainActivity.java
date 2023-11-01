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
import android.widget.Button;
import android.widget.ListView;

import com.example.mvc.Controller.Controller;
import com.example.mvc.Model.Nota;
import com.example.mvc.Model.NotaDAO;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
    }

    public void cadastrar (View v) {
        Intent i = new Intent(this, ExibirNota.class);
        i.putExtra("nota", 0);
        startActivity(i);
    }

    public void onStart() {
        super.onStart();
        Controller Controller = new Controller(this);
        ArrayList<String> dataset = Controller.listaTituloNotas();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.activity_list_item,
                android.R.id.text1,
                dataset
        );
        listView.setAdapter(adapter);
    }
}