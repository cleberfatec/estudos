package br.com.deepcode.other;

import br.com.deepcode.other.enums.Cargo;
import br.com.deepcode.other.model.Funcionario;
import br.com.deepcode.other.service.PromocaoService;

public class TestPromocaoCargo {

	public static void main(String[] args) {

		PromocaoService promocaoService = new PromocaoService();
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(Cargo.ANALISTA);
		funcionario.setId(1010);
		funcionario.setNome("Fulano");
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCargo(Cargo.ESPECIALISTA);
		funcionario1.setId(2000);
		funcionario1.setNome("Beltrano");
		
		promocaoService.promover(funcionario, true);
		promocaoService.promover(funcionario1, true);
		
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario1.getCargo());
		
	}

}
