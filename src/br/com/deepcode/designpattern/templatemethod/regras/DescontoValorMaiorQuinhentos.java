package br.com.deepcode.designpattern.templatemethod.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public class DescontoValorMaiorQuinhentos extends Desconto {

	public DescontoValorMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
