package projetofinal.IA.src.main.java;

import java.util.ArrayList;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

public class UnaryConstraint implements Constraint<Variable, String> {

	private Variable var1;
	private String valor;
	private List<Variable> scope;
	
	public UnaryConstraint(Variable var1, String valor) {
		this.var1 = var1;
		this.valor = valor;
		scope = new ArrayList<>(1);
		scope.add(var1);
	}

	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<Variable, String> assignment) {
		String value1 = assignment.getValue(var1);
		return value1 == null || value1.equals(valor);
	}

}
