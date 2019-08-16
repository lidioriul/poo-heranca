package br.com.estudo.heranca;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    private final String tipoEstabelecimento;
    private List<Produto> produtos;
    private List<Produto> itens;

    public Estabelecimento(String tipoEstabelecimento, List<Produto> produtos) {
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.produtos = produtos;
        this.itens = new ArrayList<>();
    }

    public void caixa() {
        System.out.println("CAIXA DO PAI (CLASSE Estabelecimento)");
        BigDecimal totalCobrar = BigDecimal.valueOf(this.itens.stream().map(i -> i.getValor()).mapToDouble(BigDecimal::doubleValue).sum());
        System.out.println(String.format("DEVE SER PAGO %.2f", totalCobrar));
    }

    public void addItens(Produto produto) {
        this.itens.add(produto);
    }

    public List<Produto> getItens() {
        return this.itens;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }
}
