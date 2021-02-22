package br.com.deepcode.designpattern.strategy.service;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;
import br.com.deepcode.designpattern.strategy.calculos.ImpostoStrategy;

public class CalculadoraImpostoService {
	
	public BigDecimal calcular(Orcamento orcamento, ImpostoStrategy impostoStrategy) {
		return impostoStrategy.calcular(orcamento);
	}

}
