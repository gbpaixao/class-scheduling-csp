package projetofinal.IA.src.main.java;

import aima.core.search.csp.Variable;

public class Horario extends Variable {
	
	// private Atividade atividade;
	private String teste;

	public Horario(String name) {
		super(name);
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	
//	public Atividade getAtividade() {
//		return atividade;
//	}
//	
//	public void setAtividade(Atividade atividade) {
//		this.atividade = atividade;
//	}

}
