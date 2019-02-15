package com.example.aluno.computershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PagamentoCartao extends AppCompatActivity {

    String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento_cartao);
    }

    public void playcartao(String mensagem){
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
    }

    public void finalizar_cartao(View view) {
        mensagem = "Sua fatura será enviada para o email";
        playcartao(mensagem);
        finish();
    }
}
