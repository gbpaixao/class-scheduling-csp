package projetofinal.IA.src.main.java;

import java.util.List;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Variable;

public class DrawTimetable {

	public void draw(Assignment<Variable, String> solution) {
		
		String H2M1 = " --- ";
		String H3M1 = " --- ";
		String H4M1 = " --- ";
		String H5M1 = " --- ";
		String H6M1 = " --- ";
		String H2M2 = " --- ";
		String H3M2 = " --- ";
		String H4M2 = " --- ";
		String H5M2 = " --- ";
		String H6M2 = " --- ";
		String H2M3 = " --- ";
		String H3M3 = " --- ";
		String H4M3 = " --- ";
		String H5M3 = " --- ";
		String H6M3 = " --- ";
		String H2M4 = " --- ";
		String H3M4 = " --- ";
		String H4M4 = " --- ";
		String H5M4 = " --- ";
		String H6M4 = " --- ";
		String H2M5 = " --- ";
		String H3M5 = " --- ";
		String H4M5 = " --- ";
		String H5M5 = " --- ";
		String H6M5 = " --- ";
		String H2M6 = " --- ";
		String H3M6 = " --- ";
		String H4M6 = " --- ";
		String H5M6 = " --- ";
		String H6M6 = " --- ";
		String H2T1 = " --- ";
		String H3T1 = " --- ";
		String H4T1 = " --- ";
		String H5T1 = " --- ";
		String H6T1 = " --- ";
		String H2T2 = " --- ";
		String H3T2 = " --- ";
		String H4T2 = " --- ";
		String H5T2 = " --- ";
		String H6T2 = " --- ";
		String H2T3 = " --- ";
		String H3T3 = " --- ";
		String H4T3 = " --- ";
		String H5T3 = " --- ";
		String H6T3 = " --- ";
		String H2T4 = " --- ";
		String H3T4 = " --- ";
		String H4T4 = " --- ";
		String H5T4 = " --- ";
		String H6T4 = " --- ";
		String H2T5 = " --- ";
		String H3T5 = " --- ";
		String H4T5 = " --- ";
		String H5T5 = " --- ";
		String H6T5 = " --- ";
		String H2T6 = " --- ";
		String H3T6 = " --- ";
		String H4T6 = " --- ";
		String H5T6 = " --- ";
		String H6T6 = " --- ";
		String H2N1 = " --- ";
		String H2N2 = " --- ";
		String H2N3 = " --- ";
		String H2N4 = " --- ";
		String H3N1 = " --- ";
		String H3N2 = " --- ";
		String H3N3 = " --- ";
		String H3N4 = " --- ";
		String H4N1 = " --- ";
		String H4N2 = " --- ";
		String H4N3 = " --- ";
		String H4N4 = " --- ";
		String H5N1 = " --- ";
		String H5N2 = " --- ";
		String H5N3 = " --- ";
		String H5N4 = " --- ";
		String H6N1 = " --- ";
		String H6N2 = " --- ";
		String H6N3 = " --- ";
		String H6N4 = " --- ";
		
		List<Variable> variables = solution.getVariables();
		
		for (Variable variable : variables) {
			String varName = variable.getName();
			String varValue = solution.getValue(variable);

			switch(varName) {
				case "H2M1": 
				  H2M1 = varValue; break;
				case "H3M1": 
				  H3M1 = varValue; break;
				case "H4M1": 
				  H4M1 = varValue; break;
				case "H5M1": 
				  H5M1 = varValue; break;
				case "H6M1": 
				  H6M1 = varValue; break;
				case "H2M2": 
				  H2M2 = varValue; break;
				case "H3M2": 
				  H3M2 = varValue; break;
				case "H4M2": 
				  H4M2 = varValue; break;
				case "H5M2": 
				  H5M2 = varValue; break;
				case "H6M2": 
				  H6M2 = varValue; break;
				case "H2M3": 
				  H2M3 = varValue; break;
				case "H3M3": 
				  H3M3 = varValue; break;
				case "H4M3": 
				  H4M3 = varValue; break;
				case "H5M3": 
				  H5M3 = varValue; break;
				case "H6M3": 
				  H6M3 = varValue; break;
				case "H2M4": 
				  H2M4 = varValue; break;
				case "H3M4": 
				  H3M4 = varValue; break;
				case "H4M4": 
				  H4M4 = varValue; break;
				case "H5M4": 
				  H5M4 = varValue; break;
				case "H6M4": 
				  H6M4 = varValue; break;
				case "H2M5": 
				  H2M5 = varValue; break;
				case "H3M5": 
				  H3M5 = varValue; break;
				case "H4M5": 
				  H4M5 = varValue; break;
				case "H5M5": 
				  H5M5 = varValue; break;
				case "H6M5": 
				  H6M5 = varValue; break;
				case "H2M6": 
				  H2M6 = varValue; break;
				case "H3M6": 
				  H3M6 = varValue; break;
				case "H4M6": 
				  H4M6 = varValue; break;
				case "H5M6": 
				  H5M6 = varValue; break;
				case "H6M6": 
				  H6M6 = varValue; break;
				case "H2T1": 
				  H2T1 = varValue; break;
				case "H3T1": 
				  H3T1 = varValue; break;
				case "H4T1": 
				  H4T1 = varValue; break;
				case "H5T1": 
				  H5T1 = varValue; break;
				case "H6T1": 
				  H6T1 = varValue; break;
				case "H2T2": 
				  H2T2 = varValue; break;
				case "H3T2": 
				  H3T2 = varValue; break;
				case "H4T2": 
				  H4T2 = varValue; break;
				case "H5T2": 
				  H5T2 = varValue; break;
				case "H6T2": 
				  H6T2 = varValue; break;
				case "H2T3": 
				  H2T3 = varValue; break;
				case "H3T3": 
				  H3T3 = varValue; break;
				case "H4T3": 
				  H4T3 = varValue; break;
				case "H5T3": 
				  H5T3 = varValue; break;
				case "H6T3": 
				  H6T3 = varValue; break;
				case "H2T4": 
				  H2T4 = varValue; break;
				case "H3T4": 
				  H3T4 = varValue; break;
				case "H4T4": 
				  H4T4 = varValue; break;
				case "H5T4": 
				  H5T4 = varValue; break;
				case "H6T4": 
				  H6T4 = varValue; break;
				case "H2T5": 
				  H2T5 = varValue; break;
				case "H3T5": 
				  H3T5 = varValue; break;
				case "H4T5": 
				  H4T5 = varValue; break;
				case "H5T5": 
				  H5T5 = varValue; break;
				case "H6T5": 
				  H6T5 = varValue; break;
				case "H2T6": 
				  H2T6 = varValue; break;
				case "H3T6": 
				  H3T6 = varValue; break;
				case "H4T6": 
				  H4T6 = varValue; break;
				case "H5T6": 
				  H5T6 = varValue; break;
				case "H6T6": 
				  H6T6 = varValue; break;
				case "H2N1": 
				  H2N1 = varValue; break;
				case "H2N2": 
				  H2N2 = varValue; break;
				case "H2N3": 
				  H2N3 = varValue; break;
				case "H2N4": 
				  H2N4 = varValue; break;
				case "H3N1": 
				  H3N1 = varValue; break;
				case "H3N2": 
				  H3N2 = varValue; break;
				case "H3N3": 
				  H3N3 = varValue; break;
				case "H3N4": 
				  H3N4 = varValue; break;
				case "H4N1": 
				  H4N1 = varValue; break;
				case "H4N2": 
				  H4N2 = varValue; break;
				case "H4N3": 
				  H4N3 = varValue; break;
				case "H4N4": 
				  H4N4 = varValue; break;
				case "H5N1": 
				  H5N1 = varValue; break;
				case "H5N2": 
				  H5N2 = varValue; break;
				case "H5N3": 
				  H5N3 = varValue; break;
				case "H5N4": 
				  H5N4 = varValue; break;
				case "H6N1": 
				  H6N1 = varValue; break;
				case "H6N2": 
				  H6N2 = varValue; break;
				case "H6N3": 
				  H6N3 = varValue; break;
				case "H6N4": 
				  H6N4 = varValue; break;
				default: 
					System.out.println("Problema ao printar. ");
			}
		}
		StringBuilder timetable = new StringBuilder();
		
		timetable.append("   Horários    | Segunda |  Terça  |  Quarta  |  Quinta  |  Sexta  \n");
		timetable.append("07:00 - 08:00 "); timetable.append(" | ");
		timetable.append(H2M1); timetable.append(" | ");
		timetable.append(H3M1); timetable.append(" | ");
		timetable.append(H4M1); timetable.append(" | ");
		timetable.append(H5M1); timetable.append(" | ");
		timetable.append(H6M1); timetable.append("\n");

		timetable.append("08:00 - 09:00 "); timetable.append(" | ");
		timetable.append(H2M2); timetable.append(" | ");
		timetable.append(H3M2); timetable.append(" | ");
		timetable.append(H4M2); timetable.append(" | ");
		timetable.append(H5M2); timetable.append(" | ");
		timetable.append(H6M2); timetable.append("\n");

		timetable.append("09:00 - 10:00 "); timetable.append(" | ");
		timetable.append(H2M3); timetable.append(" | ");
		timetable.append(H3M3); timetable.append(" | ");
		timetable.append(H4M3); timetable.append(" | ");
		timetable.append(H5M3); timetable.append(" | ");
		timetable.append(H6M3); timetable.append("\n");

		timetable.append("10:00 - 11:00 "); timetable.append(" | ");
		timetable.append(H2M4); timetable.append(" | ");
		timetable.append(H3M4); timetable.append(" | ");
		timetable.append(H4M4); timetable.append(" | ");
		timetable.append(H5M4); timetable.append(" | ");
		timetable.append(H6M4); timetable.append("\n");

		timetable.append("11:00 - 12:00 "); timetable.append(" | ");
		timetable.append(H2M5); timetable.append(" | ");
		timetable.append(H3M5); timetable.append(" | ");
		timetable.append(H4M5); timetable.append(" | ");
		timetable.append(H5M5); timetable.append(" | ");
		timetable.append(H6M5); timetable.append("\n");

		timetable.append("12:00 - 13:00 "); timetable.append(" | ");
		timetable.append(H2M6); timetable.append(" | ");
		timetable.append(H3M6); timetable.append(" | ");
		timetable.append(H4M6); timetable.append(" | ");
		timetable.append(H5M6); timetable.append(" | ");
		timetable.append(H6M6); timetable.append("\n");
		
		timetable.append("13:00 - 14:00 "); timetable.append(" | ");
		timetable.append(H2T1); timetable.append(" | ");
		timetable.append(H3T1); timetable.append(" | ");
		timetable.append(H4T1); timetable.append(" | ");
		timetable.append(H5T1); timetable.append(" | ");
		timetable.append(H6T1); timetable.append("\n");

		timetable.append("14:00 - 15:00 "); timetable.append(" | ");
		timetable.append(H2T2); timetable.append(" | ");
		timetable.append(H3T2); timetable.append(" | ");
		timetable.append(H4T2); timetable.append(" | ");
		timetable.append(H5T2); timetable.append(" | ");
		timetable.append(H6T2); timetable.append("\n");
		
		timetable.append("15:00 - 16:00 "); timetable.append(" | ");
		timetable.append(H2T3); timetable.append(" | ");
		timetable.append(H3T3); timetable.append(" | ");
		timetable.append(H4T3); timetable.append(" | ");
		timetable.append(H5T3); timetable.append(" | ");
		timetable.append(H6T3); timetable.append("\n");

		timetable.append("16:00 - 17:00 "); timetable.append(" | ");
		timetable.append(H2T4); timetable.append(" | ");
		timetable.append(H3T4); timetable.append(" | ");
		timetable.append(H4T4); timetable.append(" | ");
		timetable.append(H5T4); timetable.append(" | ");
		timetable.append(H6T4); timetable.append("\n");

		timetable.append("17:00 - 18:00 "); timetable.append(" | ");
		timetable.append(H2T5); timetable.append(" | ");
		timetable.append(H3T5); timetable.append(" | ");
		timetable.append(H4T5); timetable.append(" | ");
		timetable.append(H5T5); timetable.append(" | ");
		timetable.append(H6T5); timetable.append("\n");

		timetable.append("18:00 - 19:00 "); timetable.append(" | ");
		timetable.append(H2T6); timetable.append(" | ");
		timetable.append(H3T6); timetable.append(" | ");
		timetable.append(H4T6); timetable.append(" | ");
		timetable.append(H5T6); timetable.append(" | ");
		timetable.append(H6T6); timetable.append("\n");
		
		timetable.append("19:00 - 20:00 "); timetable.append(" | ");
		timetable.append(H2N1); timetable.append(" | ");
		timetable.append(H3N1); timetable.append(" | ");
		timetable.append(H4N1); timetable.append(" | ");
		timetable.append(H5N1); timetable.append(" | ");
		timetable.append(H6N1); timetable.append("\n");

		timetable.append("20:00 - 21:00 "); timetable.append(" | ");
		timetable.append(H2N2); timetable.append(" | ");
		timetable.append(H3N2); timetable.append(" | ");
		timetable.append(H4N2); timetable.append(" | ");
		timetable.append(H5N2); timetable.append(" | ");
		timetable.append(H6N2); timetable.append("\n");

		timetable.append("21:00 - 22:00 "); timetable.append(" | ");
		timetable.append(H2N3); timetable.append(" | ");
		timetable.append(H3N3); timetable.append(" | ");
		timetable.append(H4N3); timetable.append(" | ");
		timetable.append(H5N3); timetable.append(" | ");
		timetable.append(H6N3); timetable.append("\n");

		timetable.append("22:00 - 23:00 "); timetable.append(" | ");
		timetable.append(H2N4); timetable.append(" | ");
		timetable.append(H3N4); timetable.append(" | ");
		timetable.append(H4N4); timetable.append(" | ");
		timetable.append(H5N4); timetable.append(" | ");
		timetable.append(H6N4); timetable.append("\n");
		
		System.out.println(timetable);
	}
	
}
