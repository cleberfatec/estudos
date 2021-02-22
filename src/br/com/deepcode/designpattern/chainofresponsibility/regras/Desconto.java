package br.com.deepcode.designpattern.chainofresponsibility.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
