package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public class CalculadoraDeDescontos {

	public double calculaDesconto(Orcamento orcamento) {

		Desconto d1 = new DescontoQuantidade();
		Desconto d2 = new DescontoValor();
		
		// ültimo elo da cadeia. Usado para finalizar
		Desconto d3 = new SemDesconto();

		// cria a cadeia
		d1.setProximoDesconto(d2);
		
		// Indica o final
		d2.setProximoDesconto(d3);

		return d1.calculaDesconto(orcamento);
	}

}
