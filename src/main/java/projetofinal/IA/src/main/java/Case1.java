package projetofinal.IA.src.main.java;
import java.util.Arrays;
import java.util.List;

import aima.core.search.csp.*;

public class Case1 extends CSP<Variable, String>{
	
	/* Defini??o de vari?veis */
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
	
	// Colocando todas as vari?veis em uma Lista
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
	
	/* Defini??o das atividades */ 
	public static String COMP0455 = new String("COMP0455");
	public static String COMP0481 = new String("COMP0481");
	public static String COMP0408 = new String("COMP0408");
	public static String PIBIC = new String("PIBIC");
	public static String ESCOMP0455 = new String("ESCOMP0455");
	public static String ESCOMP0481 = new String("ESCOMP0481");
	public static String ESCOMP0408 = new String("ESCOMP0408");
	public static String VAZIO = new String("---  ");
	
	
	/* Tem 3 disciplinas e faz PIBIC */
	public Case1() {
		// Cria??o das vari?veis
		super(allVar);
		
		Domain<String> atividades = new Domain<>(
				COMP0408, COMP0455, COMP0481, PIBIC, ESCOMP0455,
				ESCOMP0481, ESCOMP0408, VAZIO
		);
		
		for (Variable var : getVariables())
			setDomain(var, atividades);
		
		/* RESTRI??ES */
		// Restri??es Un?rias
		addConstraint(new UnaryConstraint(H3T3, COMP0455));
		addConstraint(new UnaryConstraint(H3T4, COMP0455));
		addConstraint(new UnaryConstraint(H5T3, COMP0455));
		addConstraint(new UnaryConstraint(H5T4, COMP0455));
		addConstraint(new UnaryConstraint(H5N1, COMP0481));
		addConstraint(new UnaryConstraint(H5N2, COMP0481));
		addConstraint(new UnaryConstraint(H2N3, COMP0408));
		addConstraint(new UnaryConstraint(H2N4, COMP0408));
		addConstraint(new UnaryConstraint(H4N3, COMP0408));
		addConstraint(new UnaryConstraint(H4N4, COMP0408));
		addConstraint(new UnaryConstraint(H2T1, PIBIC));
		addConstraint(new UnaryConstraint(H2T2, PIBIC));
		addConstraint(new UnaryConstraint(H2T3, PIBIC));
		addConstraint(new UnaryConstraint(H2T4, PIBIC));
		addConstraint(new UnaryConstraint(H2T5, PIBIC));
		addConstraint(new UnaryConstraint(H2T6, PIBIC));
		addConstraint(new UnaryConstraint(H4T1, PIBIC));
		addConstraint(new UnaryConstraint(H4T2, PIBIC));
		addConstraint(new UnaryConstraint(H4T3, PIBIC));
		addConstraint(new UnaryConstraint(H4T4, PIBIC));
		addConstraint(new UnaryConstraint(H4T5, PIBIC));
		addConstraint(new UnaryConstraint(H4T6, PIBIC));
		addConstraint(new UnaryConstraint(H6T1, PIBIC));
		addConstraint(new UnaryConstraint(H6T2, PIBIC));
		addConstraint(new UnaryConstraint(H6T3, PIBIC));
		addConstraint(new UnaryConstraint(H6T4, PIBIC));
		addConstraint(new UnaryConstraint(H6T5, PIBIC));
		addConstraint(new UnaryConstraint(H6T6, PIBIC));
		addConstraint(new UnaryConstraint(H5T5, PIBIC));
		addConstraint(new UnaryConstraint(H5T6, PIBIC));
		
		// Restri??es de volume
		addConstraint(new VolumeConstraint(allVar, COMP0455, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0408, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0481, 2));
		addConstraint(new VolumeConstraint(allVar, PIBIC, 20));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0455, 4));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0408, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0481, 2));
	}
}
