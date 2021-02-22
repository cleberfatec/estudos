package br.com.deepcode.designpattern.templatemethod.service;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;
import br.com.deepcode.designpattern.templatemethod.regras.Desconto;
import br.com.deepcode.designpattern.templatemethod.regras.DescontoItensMaiorCinco;
import br.com.deepcode.designpattern.templatemethod.regras.DescontoValorMaiorQuinhentos;
import br.com.deepcode.designpattern.templatemethod.regras.SemDesconto;

public class CalculadoraDescontosService {

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		
		Desconto desconto = new DescontoItensMaiorCinco(new DescontoValorMaiorQuinhentos(new SemDesconto()));
		return desconto.efetuarCalculoTemplateMethod(orcamento);
	}
}
