package projetofinal.IA.src.main.java;

import java.util.Optional;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.CSP;
import aima.core.search.csp.Variable;
import aima.core.search.csp.solver.CspListener;
import aima.core.search.csp.solver.CspSolver;
import aima.core.search.csp.solver.MinConflictsSolver;

public class Main {
	
	static int retry = 1;
	
	public static void main(String[] args) {
		CSP<Variable, String> csp = new Case1();
		CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		
		solver = new MinConflictsSolver<>(100000);
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		System.out.println("Classes scheduling (Minimum Conflicts)");
		solution = solver.solve(csp);
		solution.ifPresent(System.out::println);
		System.out.println(stepCounter.getResults() + "\n");
		
		DrawTimetable drawTimetable = new DrawTimetable();
		if(!solution.isEmpty()) {
			drawTimetable.draw(solution.get());
		} else {
			retry++;
			System.out.println("Tentativa "+ retry +":");
			main(args);
		}
	}
}
