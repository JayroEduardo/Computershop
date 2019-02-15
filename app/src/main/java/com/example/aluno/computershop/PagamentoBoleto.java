package com.example.aluno.computershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PagamentoBoleto extends AppCompatActivity {

    String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento_boleto);
    }

    public void playfatura(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void finalizarboleto(View view) {
        mensagem = "Seu Boleto será enviado para o email";
        playfatura(mensagem);
        finish();
    }
}
