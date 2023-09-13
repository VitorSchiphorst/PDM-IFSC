package com.example.frutalistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemFrutasAdapter extends ArrayAdapter<ItemFrutas> {

    Context myContext;
    int myResource;

    public ItemFrutasAdapter(@NonNull Context context, int resource, @NonNull List<ItemFrutas> objects) {
        super(context, resource, objects);
        myContext = context;
        myResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Inflar o Layout
        LayoutInflater inflater = LayoutInflater.from(myContext);
        convertView = inflater.inflate(myResource, parent, false);

        TextView txtNome = convertView.findViewById(R.id.nome);
        TextView txtId = convertView.findViewById(R.id.id);
        ImageView txtImage = convertView.findViewById(R.id.imageView);

        txtImage.setText(getItem(position).nome);
        txtId.setText(String.valueOf(getItem(position).id));
        txtImage.setImageResource(getItem(position).image);

        // return super.getView(position, convertView, parent);

        return convertView;
    }
}
