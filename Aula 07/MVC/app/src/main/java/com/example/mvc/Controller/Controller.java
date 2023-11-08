package com.example.mvc.Controller;

import android.content.Context;

import com.example.mvc.Model.Nota;
import com.example.mvc.Model.NotaDAO;

import java.util.ArrayList;

public class Controller {
    // Nota Controller terá os métodos
    // cadNota (Nota n)
    // updateNota (Nota n)
    // deleteNota (id)
    // getAllNotas
    // getNota (id)

    Context mContext;
    NotaDAO notaDAO;

    public Controller(Context c) {
        mContext = c;
        notaDAO = new NotaDAO(c);
    }

    public Nota cadastrarNota(Nota n) {
        return notaDAO.inserirNota(n);
    }

    public ArrayList<Nota> listaNotas() {
        return notaDAO.getListaNota();
    }

    public ArrayList<String> listaTituloNotas() {
        ArrayList<String> result = new ArrayList<String>();
        for (Nota nota: this.listaNotas()) {
            result.add(nota.getNota().toString());
        }
        return result;
    }
}
