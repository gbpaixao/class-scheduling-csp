package projetofinal.IA.src.main.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

public class AllActivitiesConstraint implements Constraint<Variable, String> {

	private List<Variable> scope;
	private List<String> effectiveDomain;
	
	public AllActivitiesConstraint(List<Variable> scope, List<String>effectiveDomain) {
		this.scope = scope;
		this.effectiveDomain = effectiveDomain;
	}
	
	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<Variable, String> assignment) {
		int counter = 0; // conta todos os elementos da lista
		ArrayList<String> domain = new ArrayList<String>();
		
		for (Iterator<Variable> i = scope.iterator(); i.hasNext(); ) {
			Variable elementI = i.next();
			domain.add(assignment.getValue(elementI));
			//System.out.println("elementI: " + assignment.getValue(elementI));
			//System.out.println("domain: " + domain);
		}
		
		//System.out.println("domain final: " + domain);
		//System.out.println("this.effectiveDomain" + this.effectiveDomain);
		boolean containsAllEffectiveDomain = domain.containsAll(this.effectiveDomain);
		
		return containsAllEffectiveDomain;
	}

}
