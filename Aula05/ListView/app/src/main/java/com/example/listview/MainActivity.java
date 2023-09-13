package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> nomes = new ArrayList<>();
    ListView listView;

    EditText valor;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);
        valor = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        nomes.addAll(Arrays.asList("Carne", "Farofa", "Cerveja"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                nomes
        );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+Integer.toString(i), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setarValor (View v){
        String valorEditText = valor.getText().toString();
        nomes.add(valorEditText);
        valor.setText("");
        InputMethodManager input = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        input.hideSoftInputFromWindow(valor.getWindowToken(), 0);
    }


}