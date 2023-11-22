package com.example.mvc.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class NotaDAO {
    // Insert, Update, Delete, GetAll

    SQLiteDatabase db;

    public NotaDAO(Context c) {
        this.db = c.openOrCreateDatabase("notas.db", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nota VARCHAR);");
    }

    public Nota inserirNota(Nota n) {
        ContentValues cv = new ContentValues();
        cv.put("nota", n.nota);
        db.insert("notas", null, cv);
        return n;
    }

    public ArrayList<Nota> getListaNota() {
        Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
        cursor.moveToFirst();
        ArrayList<Nota> array = new ArrayList<>();

        while (cursor.isAfterLast()) {
            Nota n = new Nota(cursor.getInt(0), cursor.getString(1));
            array.add(n);
            cursor.moveToNext();
        }
        return array;
    }
}
