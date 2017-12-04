package br.com.design.chainresponsibility;

import br.com.design.strategy.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double calculaDesconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximoDesconto(Desconto proximo) {
		// N�o tem pr�ximo desconto

	}

}
