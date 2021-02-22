package br.com.deepcode.designpattern.strategy.calculos;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public class ISS implements ImpostoStrategy {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
	}
}
