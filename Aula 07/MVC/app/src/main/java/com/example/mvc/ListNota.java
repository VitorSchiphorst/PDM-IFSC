package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mvc.Controller.Controller;
import com.example.mvc.Model.NotaDAO;

import java.util.ArrayList;

public class ListNota extends AppCompatActivity {

    ListView listView;
    NotaDAO notaDao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_nota);
        listView = findViewById(R.id.listview);
    }

    public void onStart() {
        super.onStart();
        notaDao.getListaNota();
    }
}