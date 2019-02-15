package com.example.aluno.computershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PagamentoPayPal extends AppCompatActivity {

    String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento_pay_pal);
    }

    public void playpaypal(String men){
        Toast.makeText(getApplicationContext(), men, Toast.LENGTH_SHORT).show();
    }

    public void finalizar_paypal(View view) {
        mensagem = "entre com a sua conta PayPal";
        playpaypal(mensagem);
        finish();
    }
}
