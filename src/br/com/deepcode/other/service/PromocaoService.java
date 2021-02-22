package br.com.deepcode.other.service;

import br.com.deepcode.other.enums.Cargo;
import br.com.deepcode.other.model.Funcionario;

public class PromocaoService {

	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (cargoAtual == Cargo.GERENTE) {
			System.out.println("Gerentes não podem ser promovidos!");
		}

		if (metaBatida) {
			Cargo novoCargo = cargoAtual.proximoCargo();
			funcionario.setCargo(novoCargo);
		}

	}
}
