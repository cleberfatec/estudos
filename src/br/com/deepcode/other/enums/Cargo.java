package br.com.deepcode.other.enums;

public enum Cargo {
		GERENTE {
			@Override
			public Cargo proximoCargo() {
				return GERENTE;
			}
		},
		ANALISTA {
			@Override
			public Cargo proximoCargo() {
				return ESPECIALISTA;
			}
		},
		ASSISTENTE {
			@Override
			public Cargo proximoCargo() {
				return ANALISTA;
			}
		},
		ESPECIALISTA {
			@Override
			public Cargo proximoCargo() {
				return GERENTE;
			}
		};
	
	public abstract Cargo proximoCargo();
		

}
