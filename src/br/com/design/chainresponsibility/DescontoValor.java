package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public class DescontoValor implements Desconto {

	private Desconto proximo;

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		
		if(orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return proximo.calculaDesconto(orcamento);
		}
		
	}
	
	@Override
	public void setProximoDesconto(Desconto proximo) {
		this.proximo = proximo;
		
		
	}


}
