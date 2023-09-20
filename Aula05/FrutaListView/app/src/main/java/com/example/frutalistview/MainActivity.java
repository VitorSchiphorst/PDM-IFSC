package com.example.frutalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<ItemFrutas> listaItensFrutas = new ArrayList<ItemFrutas>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        listaItensFrutas.add(new ItemFrutas(1, "Laranja", R.drawable.laranja));
        listaItensFrutas.add(new ItemFrutas(4, "Melancia", R.drawable.melancia));

        ItemFrutasAdapter adapter = new ItemFrutasAdapter(this, R.layout.item_frutas, listaItensFrutas);
        listView.setAdapter(adapter);
    }
}