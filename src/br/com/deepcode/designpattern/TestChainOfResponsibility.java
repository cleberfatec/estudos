package br.com.deepcode.designpattern;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.chainofresponsibility.service.CalculadoraDescontosService;
import br.com.deepcode.designpattern.model.Orcamento;

public class TestChainOfResponsibility {

	public static void main(String[] args) {

		CalculadoraDescontosService service = new CalculadoraDescontosService();
		Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 1000);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);
		
		BigDecimal desconto1 = service.calcular(orcamento1);
		BigDecimal desconto2 = service.calcular(orcamento2);
		
		System.out.println("Desconto1: " + desconto1);
		System.out.println("Desconto2: " + desconto2);
		
	}

}
