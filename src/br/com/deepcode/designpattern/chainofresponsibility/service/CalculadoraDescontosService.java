package br.com.deepcode.designpattern.chainofresponsibility.service;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.chainofresponsibility.regras.Desconto;
import br.com.deepcode.designpattern.chainofresponsibility.regras.DescontoItensMaiorCinco;
import br.com.deepcode.designpattern.chainofresponsibility.regras.DescontoValorMaiorQuinhentos;
import br.com.deepcode.designpattern.chainofresponsibility.regras.SemDesconto;
import br.com.deepcode.designpattern.model.Orcamento;

public class CalculadoraDescontosService {

	public BigDecimal calcular(Orcamento orcamento) {
		
		Desconto desconto = new DescontoItensMaiorCinco(new DescontoValorMaiorQuinhentos(new SemDesconto()));
		return desconto.calcular(orcamento);
		
	}
}
