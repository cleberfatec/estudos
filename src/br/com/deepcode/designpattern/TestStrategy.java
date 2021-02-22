package br.com.deepcode.designpattern;

import java.math.BigDecimal;

import br.com.deepcode.designpattern.model.Orcamento;
import br.com.deepcode.designpattern.strategy.calculos.ICMS;
import br.com.deepcode.designpattern.strategy.calculos.ISS;
import br.com.deepcode.designpattern.strategy.service.CalculadoraImpostoService;

public class TestStrategy {

	public static void main(String[] args) {

		CalculadoraImpostoService service = new CalculadoraImpostoService();
		Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1000);
		
		BigDecimal calculoICMS = service.calcular(orcamento, new ICMS());
		BigDecimal calculoISS = service.calcular(orcamento, new ISS());
		
		System.out.println("Or�amento: " + orcamento.getValor() + " - ICMS: " + calculoICMS);
		System.out.println("Or�amento: " + orcamento.getValor() + " - ISS: " + calculoISS);
		
	}

}
