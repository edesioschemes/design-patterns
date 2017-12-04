package br.com.design.strategy;

public class TestaImposto {

	public static void main(String[] args) {
		Imposto iss = new Iss();
		Imposto icms = new Icms();
				
		Orcamento orcamento = new Orcamento(500);
		
		CalculadorDeImposto calcular = new CalculadorDeImposto();
		
		calcular.realizaCalculo(orcamento, iss);
		calcular.realizaCalculo(orcamento, icms);
	}

}
