package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public class DescontoQuantidade implements Desconto {

	private Desconto proximo;

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return proximo.calculaDesconto(orcamento);
		}
		
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
		
	}

}
