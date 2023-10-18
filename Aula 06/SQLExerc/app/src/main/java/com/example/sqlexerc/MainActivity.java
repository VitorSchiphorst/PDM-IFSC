package com.example.sqlexerc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase sqlite;

    ListView lv;
    Button btn;
    EditText editText;

    @SuppressLint({"Range", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listview);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);

        sqlite = openOrCreateDatabase("db", MODE_PRIVATE, null);
        sqlite.execSQL("CREATE TABLE IF NOT EXISTS usr (id INTEGER PRIMARY KEY AUTOINCREMENT," + " digitado VARCHAR );");
    }

    @SuppressLint("Range")
    public void btnInput (View v) {
        String valorEditText = editText.getText().toString();
        ContentValues cv = new ContentValues();
        cv.put("digitado", valorEditText);
        sqlite.insert("usr", null, cv);
        atualizar();
    }

    private void atualizar() {
        ArrayList<String> listaUsuario = new ArrayList<>();

        Cursor cursor = sqlite.rawQuery("SELECT * FROM usr ", null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            listaUsuario.add(cursor.getString(cursor.getColumnIndex("digitado")));
            Log.d("usr", cursor.getString(cursor.getColumnIndex("id"))+ cursor.getString(cursor.getColumnIndex("digitado")));
            cursor.moveToNext();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listaUsuario);
        lv.setAdapter(arrayAdapter);
    }

}