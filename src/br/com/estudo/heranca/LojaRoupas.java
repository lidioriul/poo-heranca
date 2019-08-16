package br.com.estudo.heranca;

import java.math.BigDecimal;
import java.util.List;

public class LojaRoupas extends Estabelecimento {

    public LojaRoupas(String tipoEstabelecimento, List<Produto> produtos) {
        super(tipoEstabelecimento, produtos);
    }

    private void adicionarItens(Produto produto) {
        System.out.println("ADICIONANDO PRODUTO " + produto.getProduto());
        addItens(produto);
    }

    @Override
    public void caixa() {
        System.out.println("CAIXA DO FILHO (CLASSE LojaRoupas)");
        double total = getItens().stream().map(i -> i.getValor()).mapToDouble(BigDecimal::doubleValue).sum();
        System.out.println("VALOR TOTAL SEM DESCONTO: " + total);
        System.out.println("VALOR A SER PAGO COM 10% DE DESCONTO: " + (total - (total * 0.1)));
        recebido();
    }

    private void recebido() {
        System.out.println("VALOR RECEBIDO!!!");
    }
}
