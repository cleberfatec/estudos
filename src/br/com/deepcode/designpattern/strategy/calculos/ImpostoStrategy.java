package br.com.deepcode.designpattern.strategy.calculos;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public interface ImpostoStrategy {
	
	BigDecimal calcular(Orcamento orcamento);

}
