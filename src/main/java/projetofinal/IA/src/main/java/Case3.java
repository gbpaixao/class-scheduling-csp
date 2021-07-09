package projetofinal.IA.src.main.java;

import java.util.Arrays;
import java.util.List;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;

public class Case3 extends CSP<Variable, String>{

	/* Defini��o de vari�veis */
	
	public static Variable H2M1 = new Variable("H2M1");
	public static Variable H2M2 = new Variable("H2M2");
	public static Variable H2M3 = new Variable("H2M3");
	public static Variable H2M4 = new Variable("H2M4");
	public static Variable H2M5 = new Variable("H2M5");
//	public static Variable H2M6 = new Variable("H2M6");

	public static Variable H3M1 = new Variable("H3M1");
	public static Variable H3M2 = new Variable("H3M2");
	public static Variable H3M3 = new Variable("H3M3");
	public static Variable H3M4 = new Variable("H3M4");
	public static Variable H3M5 = new Variable("H3M5");
//	public static Variable H3M6 = new Variable("H3M6");

	public static Variable H4M1 = new Variable("H4M1");
	public static Variable H4M2 = new Variable("H4M2");
	public static Variable H4M3 = new Variable("H4M3");
	public static Variable H4M4 = new Variable("H4M4");
	public static Variable H4M5 = new Variable("H4M5");
//	public static Variable H4M6 = new Variable("H4M6");

	public static Variable H5M1 = new Variable("H5M1");
	public static Variable H5M2 = new Variable("H5M2");
	public static Variable H5M3 = new Variable("H5M3");
	public static Variable H5M4 = new Variable("H5M4");
	public static Variable H5M5 = new Variable("H5M5");
//	public static Variable H5M6 = new Variable("H5M6");

	public static Variable H6M1 = new Variable("H6M1");
	public static Variable H6M2 = new Variable("H6M2");
	public static Variable H6M3 = new Variable("H6M3");
	public static Variable H6M4 = new Variable("H6M4");
	public static Variable H6M5 = new Variable("H6M5");
//	public static Variable H6M6 = new Variable("H6M6");
	
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
	
	// Colocando todas as vari�veis em uma Lista
	static List<Variable> allVar = Arrays.asList( 
			H2M1, H2M2, H2M3, H2M4, H2M5,
			H3M1, H3M2, H3M3, H3M4, H3M5,
			H4M1, H4M2, H4M3, H4M4, H4M5,
			H5M1, H5M2, H5M3, H5M4, H5M5,
			H6M1, H6M2, H6M3, H6M4, H6M5,
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
	
	/* Defini��o das atividades (domínio) */ 
	public static String ELET0043 = new String("ELET0043");
	public static String ESTAT0011 = new String("ESTAT0011");
	public static String COMP0415 = new String("COMP0415");
	public static String MAT0096 = new String("MAT0096");
	public static String COMP0409 = new String("COMP0409");
	public static String COMP0412 = new String("COMP0412");
	public static String MAT0154 = new String("MAT0154");
	public static String COMP0417 = new String("COMP0417");

	public static String ESELET0043 = new String("ESELET0043");
	public static String ESESTAT0011 = new String("ESESTAT0011");
	public static String ESCOMP0415 = new String("ESCOMP0415");
	public static String ESMAT0096 = new String("ESMAT0096");
	public static String ESCOMP0409 = new String("ESCOMP0409");
	public static String ESCOMP0412 = new String("ESCOMP0412");
	public static String ESMAT0154 = new String("ESMAT0154");
	public static String ESCOMP0417 = new String("ESCOMP0417");
	
	public static String OUTROS = new String("Outros");
	public static String PALESTRA = new String("Palestra");
	
	public static String VAZIO = new String("---  ");
	
	/* Tem 8 disciplinas */
	public Case3() {
		// Cria��o das vari�veis
		super(allVar);
		
		Domain<String> atividades = new Domain<>(
			ELET0043, ESTAT0011, COMP0415, MAT0096, 
			COMP0409, COMP0412, MAT0154, COMP0417,
			ESELET0043, ESESTAT0011, ESCOMP0415, ESMAT0096, 
			ESCOMP0409, ESCOMP0412, ESMAT0154, ESCOMP0417, 
			OUTROS, PALESTRA,
			VAZIO, VAZIO, VAZIO, VAZIO
		);
		
		for (Variable var : getVariables())
			setDomain(var, atividades);
		
		/* RESTRI��ES */
		// Restri��es Un�rias
		addConstraint(new UnaryConstraint(H2T1, ELET0043));
		addConstraint(new UnaryConstraint(H2T2, ELET0043));
		
		addConstraint(new UnaryConstraint(H2T3, ESTAT0011));
		addConstraint(new UnaryConstraint(H2T4, ESTAT0011));
		addConstraint(new UnaryConstraint(H4T3, ESTAT0011));
		addConstraint(new UnaryConstraint(H4T4, ESTAT0011));

		addConstraint(new UnaryConstraint(H2T5, COMP0415));
		addConstraint(new UnaryConstraint(H2T6, COMP0415));
		addConstraint(new UnaryConstraint(H4T5, COMP0415));
		addConstraint(new UnaryConstraint(H4T6, COMP0415));

		addConstraint(new UnaryConstraint(H3T1, MAT0096));
		addConstraint(new UnaryConstraint(H3T2, MAT0096));
		addConstraint(new UnaryConstraint(H5T1, MAT0096));
		addConstraint(new UnaryConstraint(H5T2, MAT0096));

		addConstraint(new UnaryConstraint(H3T3, COMP0409));
		addConstraint(new UnaryConstraint(H3T4, COMP0409));
		addConstraint(new UnaryConstraint(H5T3, COMP0409));
		addConstraint(new UnaryConstraint(H5T4, COMP0409));

		addConstraint(new UnaryConstraint(H3T5, COMP0412));
		addConstraint(new UnaryConstraint(H3T6, COMP0412));
		addConstraint(new UnaryConstraint(H5T5, COMP0412));
		addConstraint(new UnaryConstraint(H5T6, COMP0412));

		addConstraint(new UnaryConstraint(H4T1, MAT0154));
		addConstraint(new UnaryConstraint(H4T2, MAT0154));
		addConstraint(new UnaryConstraint(H6T1, MAT0154));
		addConstraint(new UnaryConstraint(H6T2, MAT0154));

		addConstraint(new UnaryConstraint(H6T5, COMP0417));
		addConstraint(new UnaryConstraint(H6T6, COMP0417));
		
		// Restri��es de volume
		addConstraint(new VolumeConstraint(allVar, ELET0043, 2));
		addConstraint(new VolumeConstraint(allVar, ESTAT0011, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0415, 4));
		addConstraint(new VolumeConstraint(allVar, MAT0096, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0409, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0412, 4));
		addConstraint(new VolumeConstraint(allVar, MAT0154, 4));
		addConstraint(new VolumeConstraint(allVar, COMP0417, 2));
		
		addConstraint(new VolumeConstraint(allVar, ESELET0043, 2));
		addConstraint(new VolumeConstraint(allVar, ESESTAT0011, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0415, 2));
		addConstraint(new VolumeConstraint(allVar, ESMAT0096, 3));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0409, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0412, 2));
		addConstraint(new VolumeConstraint(allVar, ESMAT0154, 2));
		addConstraint(new VolumeConstraint(allVar, ESCOMP0417, 1));
		
		addConstraint(new VolumeConstraint(allVar, OUTROS, 2));
		addConstraint(new VolumeConstraint(allVar, PALESTRA, 2));
	}
}
