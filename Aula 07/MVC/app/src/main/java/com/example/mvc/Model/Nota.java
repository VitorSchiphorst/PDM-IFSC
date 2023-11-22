package com.example.mvc.Model;

import android.text.Editable;

public class Nota {
    int id;
    String nota;
    public Nota(int id , String nota) {
        this.id = id;
        this.nota = nota;
    }

    public int getId() {

        return id;
    }
    public void setId(int id) {

        this.id = id;
    }

    public String getNota() {

        return nota;
    }
    public void setNota(String nota) {

        this.nota = nota;
    }
}
