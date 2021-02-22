package br.com.deepcode.designpattern;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.templatemethod.service.CalculadoraDescontosService;
import br.com.deepcode.designpattern.model.Orcamento;

public class TestTemplateMethod {

	public static void main(String[] args) {

		Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 1000);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);
		
		CalculadoraDescontosService service = new CalculadoraDescontosService();
		BigDecimal desconto1 = service.efetuarCalculo(orcamento1);
		BigDecimal desconto2 = service.efetuarCalculo(orcamento2);
		
		System.out.println("Desconto1: " + desconto1);
		System.out.println("Desconto2: " + desconto2);
		
	}

}
