package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {
		
		CalculadoraDeDescontos calculaDesconto = new CalculadoraDeDescontos();
		
		Orcamento orcamento = new Orcamento(800.00);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));		
		
		double desconto = calculaDesconto.calculaDesconto(orcamento);
		System.out.println(desconto);
		
	}
	
}
