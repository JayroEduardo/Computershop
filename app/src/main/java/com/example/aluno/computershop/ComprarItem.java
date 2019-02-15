package com.example.aluno.computershop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;

public class ComprarItem extends AppCompatActivity {

    String preco2, p1, p01, soma_final;
    float preco, soma = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar_item);

        ListaAdapterItemCompra adapterItemCompra = new ListaAdapterItemCompra(this, MainActivity.listacarrinho);

        ListView listView = (ListView) findViewById(R.id.lista_item2);
        listView.setAdapter(adapterItemCompra);

        int t = MainActivity.listacarrinho.size();
        for (int i = 0; i < t; i++){
            preco2 = MainActivity.listacarrinho.get(i).getPreco1().replace("R$", "");
            p01 = preco2.replace(".", "");
            p1 = p01.replace(",", ".");
            preco = Float.parseFloat(p1);
            soma = soma + preco;
        }

        soma_final = String.valueOf(soma);
        soma_final.replace(".", ",");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(soma_final);
    }

    public static double converte(String arg) throws ParseException{
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        double number = nf.parse(arg).doubleValue();
        return number;
    }

    public void Boleto(View view) {
        Intent boleto = new Intent(ComprarItem.this, PagamentoBoleto.class);
        startActivity(boleto);
    }

    public void Cartao(View view) {
        Intent cartao = new Intent(ComprarItem.this, PagamentoCartao.class);
        startActivity(cartao);
    }

    public void PayPal(View view) {
        Intent paypal = new Intent(ComprarItem.this, PagamentoPayPal.class);
        startActivity(paypal);
    }
}
