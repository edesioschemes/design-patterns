package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public interface Desconto {
	
	public double calculaDesconto(Orcamento orcamento);
	public void setProximoDesconto(Desconto proximo);

}
