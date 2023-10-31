package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    SQLiteDatabase sqlite;
    ListView lv;

    @SuppressLint({"MissingInflatedId", "Range"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv = findViewById(R.id.listview);

        ArrayList<String> listaUsuario = new ArrayList<>();

        Cursor cursor = sqlite.rawQuery("SELECT * FROM usr ", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("digitado")));
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("idade")));
            Log.d("usr", cursor.getString(cursor.getColumnIndex("id"))
                    + cursor.getString(cursor.getColumnIndex("digitado"))
                    + cursor.getString(cursor.getColumnIndex("idade")));
            cursor.moveToNext();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listaUsuario);
        lv.setAdapter(arrayAdapter);
    }
}