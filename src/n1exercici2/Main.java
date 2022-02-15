package n1exercici2;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Month> arrayMonth = new ArrayList<>();
		
		arrayMonth.add(new Month("Enero"));
		arrayMonth.add(new Month("Febrero"));
		arrayMonth.add(new Month("Marzo"));
		arrayMonth.add(new Month("Abril"));
		arrayMonth.add(new Month("Mayo"));
		arrayMonth.add(new Month("Junio"));
		arrayMonth.add(new Month("Julio"));
		arrayMonth.add(new Month("Septiembre"));
		arrayMonth.add(new Month("Octubre"));
		arrayMonth.add(new Month("Noviembre"));
		arrayMonth.add(new Month("Diciembre"));
		
		arrayMonth.add(7, new Month("Agosto"));
		
		/*
		for(Month m: arrayMonth) {
			
			System.out.println(m.getName());
			
		}*/
		
		HashSet<Month> hashSetMonth = new HashSet<Month>(arrayMonth);
		/*
		
		Testing de diferents formes de passar l'ArrayList a HashSet.
		
		hashSetMonth.addAll(arrayMonth); 
		
		for(Month m: arrayMonth) {
			
			hashSetMonth.add(m);
			
		}
		*/
		
		arrayMonth.add(new Month("Noviembre")); // Intento afegir un duplicat i verifiquem que no ho afegeix.
		
		for(Month m: hashSetMonth) {
					
			System.out.println(m.getName());
					
		}
		
	}
	
}
