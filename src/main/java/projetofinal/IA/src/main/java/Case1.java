package projetofinal.IA.src.main.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aima.core.search.csp.*;

public class Case1 extends CSP<Variable, String>{
	
	// Defini��o de vari�veis
	public static Variable seg1 = new Variable("2M1B1");
	public static Variable seg2 = new Variable("2M1B2");
	public static Variable seg3 = new Variable("2M2B1");
	public static Variable seg4 = new Variable("2M2B2");
	public static Variable seg5 = new Variable("2M3B1");
	public static Variable seg6 = new Variable("2M3B2");
	
	// Colocando todas as vari�veis em uma Lista
	static List<Variable> allVar = Arrays.asList(seg1, seg2, seg3, seg4, seg5);
	
	// Defini��o das constantes que ser�o o dom�nio
	public static String COMP0455 = new String("COMP0455");
	public static String COMP0481 = new String("COMP0481");
	public static String COMP0408 = new String("COMP0408");
	public static String VAZIO = new String("VAZIO");
	
	public Case1() {
		// Cria��o das vari�veis
		super(allVar);
		
		Domain<String> atividades = new Domain<>(
				COMP0408, COMP0455, COMP0481, VAZIO, 
				VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO
		);
		
		for (Variable var : getVariables())
			setDomain(var, atividades);
		
		// Lista com dom�nio sem o espa�o "em branco"
		List<String> efectiveDomain = Arrays.asList(COMP0408, COMP0455, COMP0481);
		
		// Definir restri��es
//		addConstraint(new UnaryConstraint(seg1, COMP0481));
		addConstraint(new UnaryConstraint(seg2, COMP0455));
		addConstraint(new DifAllConstraint(allVar));
		addConstraint(new AllActivitiesConstraint(allVar, efectiveDomain));
	}
}
