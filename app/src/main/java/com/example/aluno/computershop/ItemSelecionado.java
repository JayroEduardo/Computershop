package com.example.aluno.computershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ItemSelecionado extends AppCompatActivity {

    String Mensagem;
    String parametro, parametro2;
    int parametro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selecionado);

        Intent intent = getIntent();
        parametro = (String) intent.getSerializableExtra("Descrição");
        parametro2 = (String) intent.getSerializableExtra("Preço");
        parametro3 = (int) intent.getSerializableExtra("Imagem");


        TextView descricao = (TextView) findViewById(R.id.descricao_item_selecionado);
        TextView preco = (TextView) findViewById(R.id.textview0);
        ImageView imagem = (ImageView) findViewById(R.id.imagem);

        descricao.setText(parametro);
        preco.setText(parametro2);
        imagem.setImageResource(Integer.parseInt(String.valueOf(parametro3)));
    }

    public void play(String mensagem){
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
    }

    public void Item_escolhido(View view) {
        ItemComprar novo = new ItemComprar(parametro3, parametro, parametro2);
        MainActivity.listacarrinho.add(novo);
        Mensagem = "Você selecionou esse item para o carrinho";
        play(Mensagem);
        finish();
    }
}
