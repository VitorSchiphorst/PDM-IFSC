package com.example.mvc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mvc.Model.Nota;

import java.util.List;

public class ArrayAdapterNotas extends ArrayAdapter<Nota> {

    Context c;
    int i;

    public ArrayAdapterNotas(@NonNull Context context, int resource, @NonNull List<Nota> objects) {
        super(context, resource, objects);
        c = context;
        i = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(c);
        convertView = inflater.inflate(i, parent, false);

        TextView txtID = convertView.findViewById(R.id.txtID);
        TextView txtNota = convertView.findViewById(R.id.txtNota);

        txtNota.setText(getItem(position).getNota());
        txtID.setText(String.valueOf(getItem(position).getId()));

        return convertView;
    }
}
