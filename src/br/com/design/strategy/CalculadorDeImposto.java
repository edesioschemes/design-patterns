package br.com.design.strategy;

public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		double icms = imposto.calcula(orcamento);
		System.out.println(icms);
	}
}
