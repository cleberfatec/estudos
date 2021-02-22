package br.com.deepcode.designpattern.templatemethod.regras;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal efetuarCalculoTemplateMethod(Orcamento orcamento) {
		if (deveCalcular(orcamento)) {
			return calcular(orcamento);
		}
		return proximo.calcular(orcamento);
	}
	
	
	public abstract boolean deveCalcular(Orcamento orcamento);
	public abstract BigDecimal calcular(Orcamento orcamento);
}
