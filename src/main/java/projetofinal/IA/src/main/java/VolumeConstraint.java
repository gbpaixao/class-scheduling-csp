package projetofinal.IA.src.main.java;

import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

public class VolumeConstraint implements Constraint<Variable, String> {
	
	private List<Variable> scope;
	String domain;
	int counter;
	
	public VolumeConstraint(List<Variable> scope, String domain, int counter) {
		this.scope = scope;
		this.domain = domain;
		this.counter = counter;
	}

	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<Variable, String> assignment) {

		int counter = 0;
		for(Variable variable: scope) {
//			System.out.println("var(value): " + assignment.getValue(variable));
//			System.out.println("domain: " + domain);
//			System.out.println("equals: " + assignment.getValue(variable).equals(domain));
//			System.out.println("=: " + assignment.getValue(variable) == domain);
//			System.out.println("counter :" + counter);
			if (assignment.getValue(variable).equals(domain)) {
				counter++;
			}
		}

		if(counter == this.counter) return true;
		else return false;
	}

}
