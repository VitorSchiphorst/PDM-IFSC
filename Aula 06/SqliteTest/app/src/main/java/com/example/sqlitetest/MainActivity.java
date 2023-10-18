package com.example.sqlitetest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase sqlite;

    ListView lv;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        sqlite = openOrCreateDatabase("db", MODE_PRIVATE, null);
        sqlite.execSQL("CREATE TABLE IF NOT EXISTS usr (id INTEGER PRIMARY KEY AUTOINCREMENT," + " nome VARCHAR );");

        ContentValues cv = new ContentValues();
        cv.put("nome", "Vitor ");
        sqlite.insert("usr", null, cv);

        Cursor cursor = sqlite.rawQuery("SELECT * FROM usr ", null);
        cursor.moveToFirst();
        ArrayList<String> listaUsuario = new ArrayList<>();
        while (!cursor.isAfterLast()) {
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("nome")));
            Log.d("usr", cursor.getString(cursor.getColumnIndex("id"))+ cursor.getString(cursor.getColumnIndex("nome")));
            cursor.moveToNext();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listaUsuario);
        lv.setAdapter(arrayAdapter);
    }
}