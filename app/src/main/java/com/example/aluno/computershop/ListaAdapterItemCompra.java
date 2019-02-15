package com.example.aluno.computershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdapterItemCompra extends ArrayAdapter<ItemComprar> {

    private Context context;
    private ArrayList<ItemComprar> listacarrinho;

    public  ListaAdapterItemCompra(Context context, ArrayList<ItemComprar> listacarrinho){
        super(context, 0, listacarrinho);
        this.context = context;
        this.listacarrinho = listacarrinho;
    }

    @Override
    public View getView(int position1, View convertView1, ViewGroup parent1) {
        ItemComprar itemposicao1 = this.listacarrinho.get(position1);
        convertView1 = LayoutInflater.from(this.context).inflate(R.layout.item_compra, null);

        ImageView imageView1 = (ImageView) convertView1.findViewById(R.id.imagem_00);
        imageView1.setImageResource(itemposicao1.getImagem1());

        TextView textView2 = (TextView) convertView1.findViewById(R.id.textview0);
        textView2.setText(itemposicao1.getDescricao1());

        TextView textView3 = (TextView) convertView1.findViewById(R.id.textview01);
        textView3.setText(itemposicao1.getPreco1());

        return convertView1;
    }
}
