package br.com.estudo.heranca;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        List<Produto> produtosSupermercado = new ArrayList<>();
        List<Produto> produtosLojaRoupa = new ArrayList<>();
        /*
        * POPULANDO AS LISTAS DE PRODUTOS
        * */
        populaProdutosSupermercado(produtosSupermercado);
        populaProdutosLojaRoupa(produtosLojaRoupa);

        /*
        * INSTANCIANDO OS OBJETOS
        * */
        Supermercado supermercado = new Supermercado("SUPERMERCADO", produtosSupermercado);
        executaSupermercado(supermercado);
        System.out.println("\n");
        LojaRoupas lojaRoupas = new LojaRoupas("LOJA ROUPAS", produtosLojaRoupa);
        executaLojaRoupas(lojaRoupas);

    }

    private static void executaSupermercado(Supermercado supermercado) {
        /*
         * ADICIONANDO ITENS NO CARRINHO PELO MÉTODO DO PAI (CLASSE 'Estabelecimento')
         * */
        supermercado.addItens(supermercado.getProdutos().get(0));
        supermercado.addItens(supermercado.getProdutos().get(1));
        /*
         * ADICIONANDO ITENS NO CARRINHO PELO MÉTODO DO FILHO (CLASSE 'Supermercado')
         * */
        supermercado.adicionarItensCarrinho(supermercado.getProdutos().get(1));
        /*
        * MOSTRANDO DADOS DAS CLASSES
        * */
        System.out.println("QUANTIDADE DE ITENS : " + supermercado.getItens().size());
        System.out.println("TIPO DO ESTABELECIMENTO NA CLASSE PAI: (Estabelecimento => " + supermercado.getTipoEstabelecimento() + ")");
        /*
         * CHAMANDO O CAIXA
         * */
        supermercado.caixa();
    }

    private static void executaLojaRoupas(LojaRoupas lojaRoupas) {
        /*
        * ADICIONANDO ITENS APENAS PELA CLASSE PAI (CLASSE Estabelecimento)
        * NÃO FOI IMPLEMENTADO OUTRO MÉTODO PARA ADICIONAR ITENS NO CARRINHO DA LOJA
        * */
        lojaRoupas.addItens(lojaRoupas.getProdutos().get(0));
        lojaRoupas.addItens(lojaRoupas.getProdutos().get(1));
        /*
         * MOSTRANDO DADOS DAS CLASSES
         * */
        System.out.println("QUANTIDADE DE ITENS : " + lojaRoupas.getItens().size());
        System.out.println("TIPO DO ESTABELECIMENTO NA CLASSE PAI: (Estabelecimento => " + lojaRoupas.getTipoEstabelecimento() + ")");
        /*
        * CHAMANDO O CAIXA
        * */
        lojaRoupas.caixa();
    }

    private static void populaProdutosSupermercado(List<Produto> produtosSupermercado) {
        produtosSupermercado.add(new Produto().setProduto("LEITE").setValor(BigDecimal.valueOf(1.6)));
        produtosSupermercado.add(new Produto().setProduto("ARROZ").setValor(BigDecimal.valueOf(9.66)));
        produtosSupermercado.add(new Produto().setProduto("FEIJÃO").setValor(BigDecimal.valueOf(4.90)));
        produtosSupermercado.add(new Produto().setProduto("DÚZIA DE OVOS").setValor(BigDecimal.valueOf(8.50)));
    }

    private static void populaProdutosLojaRoupa(List<Produto> produtosLojaRoupa) {
        produtosLojaRoupa.add(new Produto().setProduto("CALÇA JEANS").setValor(BigDecimal.valueOf(199.99)));
        produtosLojaRoupa.add(new Produto().setProduto("CAMISETA").setValor(BigDecimal.valueOf(44.99)));
        produtosLojaRoupa.add(new Produto().setProduto("CAMISETA POLO").setValor(BigDecimal.valueOf(64.99)));
        produtosLojaRoupa.add(new Produto().setProduto("CAMISA SOCIAL").setValor(BigDecimal.valueOf(89.99)));
    }
}
