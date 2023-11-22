package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mvc.Controller.Controller;
import com.example.mvc.Model.Nota;
import com.example.mvc.Model.NotaDAO;

import java.util.ArrayList;

public class ListNota extends AppCompatActivity {

    ListView lv;
    NotaDAO notaDao;
    ArrayAdapterNotas arrayAdapter;
    Controller c;
    EditText TID, TNota;
    ArrayList<Nota> list = new ArrayList<Nota>();

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_nota);
        lv = findViewById(R.id.listview);
        TNota = findViewById(R.id.txtNota);
        TID = findViewById(R.id.txtID);

        listNotas();
    }

    public void listNotas() {
        list = c.listaNotas();
        arrayAdapter = new ArrayAdapterNotas(this, R.layout.activity_list_nota, list);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0; i < parent.getChildCount(); i++) {
                    View listItem = parent.getChildAt(i);
                    listItem.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                }

                Nota notaClick = list.get(position);
                TNota.setText(notaClick.getNota());
                TID.setText(notaClick.getId());


                view.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
        });
    }

    public void cadastrar(View v){
        if (!TNota.getText().toString().equals("")){
            c.cadastrarNota(new Nota(TNota.getText());
            listNotas();
        }
    }

    public void voltar(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}