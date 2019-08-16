package br.com.estudo.heranca;

import java.math.BigDecimal;

public class Produto {

    private String produto;
    private BigDecimal valor;

    public String getProduto() {
        return produto;
    }

    public Produto setProduto(String produto) {
        this.produto = produto;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Produto setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }
}
