package br.com.deepcode.designpattern.templatemethod.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public class DescontoItensMaiorCinco extends Desconto {

	public DescontoItensMaiorCinco(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.2"));
	}

	@Override
	public boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
