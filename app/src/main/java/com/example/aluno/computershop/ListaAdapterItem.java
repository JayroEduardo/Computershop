package com.example.aluno.computershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapterItem extends ArrayAdapter<Item> {

    private Context context;
    private ArrayList<Item> lista;

    public ListaAdapterItem(Context context, ArrayList<Item> lista){
        super(context, 0, (List<Item>) lista);
        this.context = context;
        this.lista = lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item itemposicao = this.lista.get(position);
        convertView = LayoutInflater.from(this.context).inflate(R.layout.item, null);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imagem);
        imageView.setImageResource(itemposicao.getImagem());

        TextView textView = (TextView) convertView.findViewById(R.id.descricao_item);
        textView.setText(itemposicao.getDescricao());

        TextView textView1 = (TextView) convertView.findViewById(R.id.textview0);
        textView1.setText(itemposicao.getPreco());

        return convertView;
    }
}
