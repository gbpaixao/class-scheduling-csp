package projetofinal.IA.src.main.java;

import java.util.Arrays;
import java.util.List;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;

public class Case2 extends CSP<Variable, String> {
	
	/* Definição de variáveis */
	public static Variable H2T1 = new Variable("H2T1");
	public static Variable H2T2 = new Variable("H2T2");
	public static Variable H2T3 = new Variable("H2T3");
	public static Variable H2T4 = new Variable("H2T4");
	public static Variable H2T5 = new Variable("H2T5");
	public static Variable H2T6 = new Variable("H2T6");

	public static Variable H3T1 = new Variable("H3T1");
	public static Variable H3T2 = new Variable("H3T2");
	public static Variable H3T3 = new Variable("H3T3");
	public static Variable H3T4 = new Variable("H3T4");
	public static Variable H3T5 = new Variable("H3T5");
	public static Variable H3T6 = new Variable("H3T6");

	public static Variable H4T1 = new Variable("H4T1");
	public static Variable H4T2 = new Variable("H4T2");
	public static Variable H4T3 = new Variable("H4T3");
	public static Variable H4T4 = new Variable("H4T4");
	public static Variable H4T5 = new Variable("H4T5");
	public static Variable H4T6 = new Variable("H4T6");

	public static Variable H5T1 = new Variable("H5T1");
	public static Variable H5T2 = new Variable("H5T2");
	public static Variable H5T3 = new Variable("H5T3");
	public static Variable H5T4 = new Variable("H5T4");
	public static Variable H5T5 = new Variable("H5T5");
	public static Variable H5T6 = new Variable("H5T6");

	public static Variable H6T1 = new Variable("H6T1");
	public static Variable H6T2 = new Variable("H6T2");
	public static Variable H6T3 = new Variable("H6T3");
	public static Variable H6T4 = new Variable("H6T4");
	public static Variable H6T5 = new Variable("H6T5");
	public static Variable H6T6 = new Variable("H6T6");
	
	public static Variable H2N1 = new Variable("H2N1");
	public static Variable H2N2 = new Variable("H2N2");
	public static Variable H2N3 = new Variable("H2N3");
	public static Variable H2N4 = new Variable("H2N4");
	
	public static Variable H3N1 = new Variable("H3N1");
	public static Variable H3N2 = new Variable("H3N2");
	public static Variable H3N3 = new Variable("H3N3");
	public static Variable H3N4 = new Variable("H3N4");
	
	public static Variable H4N1 = new Variable("H4N1");
	public static Variable H4N2 = new Variable("H4N2");
	public static Variable H4N3 = new Variable("H4N3");
	public static Variable H4N4 = new Variable("H4N4");
	
	public static Variable H5N1 = new Variable("H5N1");
	public static Variable H5N2 = new Variable("H5N2");
	public static Variable H5N3 = new Variable("H5N3");
	public static Variable H5N4 = new Variable("H5N4");
	
	public static Variable H6N1 = new Variable("H6N1");
	public static Variable H6N2 = new Variable("H6N2");
	public static Variable H6N3 = new Variable("H6N3");
	public static Variable H6N4 = new Variable("H6N4");
	
	// Colocando todas as variáveis em uma Lista
	static List<Variable> allVar = Arrays.asList( 
			H2T1, H2T2, H2T3, H2T4, H2T5, H2T6, 
			H3T1, H3T2, H3T3, H3T4, H3T5, H3T6, 
			H4T1, H4T2, H4T3, H4T4, H4T5, H4T6, 
			H5T1, H5T2, H5T3, H5T4, H5T5, H5T6,
			H6T1, H6T2, H6T3, H6T4, H6T5, H6T6, 
			H2N1, H2N2, H2N3, H2N4, 
			H3N1, H3N2, H3N3, H3N4, 
			H4N1, H4N2, H4N3, H4N4, 
			H5N1, H5N2, H5N3, H5N4, 
			H6N1, H6N2, H6N3, H6N4
	);
	
	/* Definição das constantes que serão o domínio */ 
	public static String COMP0409 = new String("COMP0409");
	public static String COMP0438 = new String("COMP0438");
	public static String COMP0412 = new String("COMP0412");
	public static String COMP0408 = new String("COMP0408");
	public static String COMP0461 = new String("COMP0461");

	public static String ESCOMP0409 = new String("ESCOMP0409");
	public static String ESCOMP0438 = new String("ESCOMP0438");
	public static String ESCOMP0412 = new String("ESCOMP0412");
	public static String ESCOMP0408 = new String("ESCOMP0408");
	public static String ESCOMP0461 = new String("ESCOMP0461");
	
	public static String VAZIO = new String("  ---  ");
	
	
	/* Tem 5 disciplinas */
	public Case2() {
		// Criação das variáveis
		super(allVar);
		
		Domain<String> atividades = new Domain<>(
				COMP0409, COMP0438, COMP0412, COMP0408, COMP0461, 
				ESCOMP0409, ESCOMP0438, ESCOMP0412, ESCOMP0408, ESCOMP0461,
				VAZIO, VAZIO, VAZIO, VAZIO
		);
		
		for (Variable var : getVariables())
			setDomain(var, atividades);
		
		/* RESTRIÇÕES */
		// Restrições Unárias
		addConstraint(new UnaryConstraint(H2T1, COMP0409));
		addConstraint(new UnaryConstraint(H2T2, COMP0409));
		addConstraint(new UnaryConstraint(H4T1, COMP0409));
		addConstraint(new UnaryConstraint(H4T2, COMP0409));
		
		addConstraint(new UnaryConstraint(H6T1, COMP0438));
		addConstraint(new UnaryConstraint(H6T2, COMP0438));
		addConstraint(new UnaryConstraint(H6T3, COMP0438));
		addConstraint(new UnaryConstraint(H6T4, COMP0438));
		
		addConstraint(new UnaryConstraint(H3T3, COMP0412));
		addConstraint(new UnaryConstraint(H3T4, COMP0412));
		addConstraint(new UnaryConstraint(H5T3, COMP0412));
		addConstraint(new UnaryConstraint(H5T4, COMP0412));
		
		addConstraint(new UnaryConstraint(H2T5, COMP0408));
		addConstraint(new UnaryConstraint(H2T6, COMP0408));
		addConstraint(new UnaryConstraint(H4T5, COMP0408));
		addConstraint(new UnaryConstraint(H4T6, COMP0408));
		
		addConstraint(new UnaryConstraint(H2N2, COMP0461));
		addConstraint(new UnaryConstraint(H2N3, COMP0461));
		addConstraint(new UnaryConstraint(H4N2, COMP0461));
		addConstraint(new UnaryConstraint(H4N3, COMP0461));
		
		// Restrições de volume
		addConstraint(new VolumeConstraint(allVar, COMP0409, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0438, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0412, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0408, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0461, 4));
		
		addConstraint(new VolumeConstraint(allVar, ESCOMP0409, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0438, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0412, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0408, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0461, 2));
	}

}
