package com.example.aluno.computershop;

public class ItemComprar {

    private int imagem1;
    private String descricao1;
    private String preco1;

    public ItemComprar(int imagem1, String descricao1, String preco1){
        this.imagem1 = imagem1;
        this.descricao1 = descricao1;
        this.preco1 = preco1;
    }

    public int getImagem1() {
        return imagem1;
    }

    public void setImagem1(int imagem1) {
        this.imagem1 = imagem1;
    }

    public String getDescricao1() {
        return descricao1;
    }

    public void setDescricao1(String descricao1) {
        this.descricao1 = descricao1;
    }

    public String getPreco1() {
        return preco1;
    }

    public void setPreco1(String preco1) {
        this.preco1 = preco1;
    }
}
