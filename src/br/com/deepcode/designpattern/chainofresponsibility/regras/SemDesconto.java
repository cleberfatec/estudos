package br.com.deepcode.designpattern.chainofresponsibility.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
