package br.com.deepcode.designpattern.chainofresponsibility.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public class DescontoItensMaiorCinco extends Desconto {

	public DescontoItensMaiorCinco(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getQuantidadeItens() > 5) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcular(orcamento);
	}

}
