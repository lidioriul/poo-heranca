package br.com.estudo.heranca;

import java.util.List;

public class Supermercado extends Estabelecimento {

    public Supermercado(String tipoEstabelecimento, List<Produto> produtos) {
        super(tipoEstabelecimento, produtos);
    }

    public void adicionarItensCarrinho(Produto produto) {
        addItens(produto);
    }

}
