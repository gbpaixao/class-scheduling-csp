package projetofinal.IA.src.main.java;

import java.util.Iterator;
import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;

public class DifAllConstraint implements Constraint<Variable, String> {

	private List<Variable> scope;
	
	public DifAllConstraint(List<Variable> scope) {
		this.scope = scope;
	}

	public boolean allDifferent(List<Variable> scope) {
        int counter = 0;
        int counterEqual = 0;

        for (Iterator<Variable> i = scope.iterator(); i.hasNext(); ) {
            Variable elementI = i.next();
            System.out.println("elementI: "+ elementI);
            for (Iterator<Variable> j = scope.iterator(); j.hasNext(); ) {
            	Variable elementJ = j.next();
            	System.out.println("elementJ: "+ elementJ);
                if (elementI.equals(elementJ)) counterEqual++;
            }
            System.out.println("----------------------------");
            counter++;
        }

        if (counter != counterEqual) return true;
        else return false;
	}
	
	
	@Override
	public List<Variable> getScope() {
		return scope;
	}

	@Override
	public boolean isSatisfiedWith(Assignment<Variable, String> assignment) {
		/* Avalia todas os domin�os das vari�veis para ver se existe alguma igual. */
		boolean allDifferent; // true se todos os elementos forem diferentes
		int counter = 0; // conta todos os elementos da lista
        int counterEqual = 0; // conta quando os elementos s�o iguais

        for (Iterator<Variable> i = scope.iterator(); i.hasNext(); ) {
            Variable elementI = i.next();
            //System.out.println("elementI: " + assignment.getValue(elementI));
            for (Iterator<Variable> j = scope.iterator(); j.hasNext(); ) {
            	Variable elementJ = j.next();
            	//System.out.println("elementJ: " + assignment.getValue(elementJ));
                if (assignment.getValue(elementI).equals(assignment.getValue(elementJ)))
                	if (!assignment.getValue(elementI).equals("VAZIO"))
                		counterEqual++;
            }
            if (!assignment.getValue(elementI).equals("VAZIO"))
            	counter++;
            //System.out.println("counter: " + counter);
            //System.out.println("counterEqual: " + counterEqual);
            //System.out.println("---------------------------------");
        }

        /* Detalhe importante: como a itera��o est� sendo feita duas vezes na lista, 
         * certamente haver�o N casos em que os elementos ser�o iguais. Se a quantidade
         * de elementos iguais for diferente da quantidade de elementos, � porque
         * realmente existem elementos iguais na lista. 
         * */
        if (counter != counterEqual) allDifferent = false;
        else allDifferent = true;

		return allDifferent;
	}
}
