package com.example.aluno.computershop;

public class Item {
    private int imagem;
    private String descricao;
    private String preco;

    public Item(int imagem, String descricao, String preco){
        this.imagem = imagem;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Item(String parametro, String parametro2, int parametro3) {
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
