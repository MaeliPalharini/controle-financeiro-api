package br.com.maeli.controlefinanceiroapi.model;

public class Transacao {
    private String descricao;
    private double valor;
    private String tipo;
    private String categoria;

    public Transacao(String descricao, double valor, String tipo, String categoria){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return  categoria;
    }

    public void setCategoria(String categoria) {
        this. categoria = categoria;
    }

    @Override
    public String toString() {
        return getTipo().toUpperCase() + ": " + getDescricao() + " - R$" + getValor() + " | Categoria: " + getCategoria();
    }
}

















