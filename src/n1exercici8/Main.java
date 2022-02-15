package n1exercici8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("Madrid", "España");
		lhm.put("Paris", "Francia");
		lhm.put("Berlin", "Alemania");
		lhm.put("Oslo", "Noruega");
		lhm.put("Lisboa", "Portugal");
		
		ArrayList<Map.Entry<String, String>> arrayCapitals = new ArrayList<>(lhm.entrySet());
		
		lhm.clear(); // Buidem la LinkedHashMap.
		
		System.out.println("ArrayList unsorted:\n");
		
		for(Map.Entry<String, String> capitals : arrayCapitals) { // Test de que estigui ok.
			
			System.out.println(capitals.getKey() + " - " + capitals.getValue());
			
		}
		
		Collections.sort(arrayCapitals, new ComparatorMap());
		
		System.out.println("\nArrayList sorted:\n");
		
		for(Map.Entry<String, String> capitals : arrayCapitals) { 
			
			System.out.println(capitals.getKey() + " - " + capitals.getValue()); // Test per combrobar ordenació.
			lhm.put(capitals.getKey(), capitals.getValue()); // Afegim de nou al LinkedHashMap.
		
		}
		
		
		
		System.out.println("\nArrayList to LinkedHashMap:\n");
		
		for(Map.Entry<String, String> sortedCapitals : lhm.entrySet()) {
			
			System.out.println(sortedCapitals.getKey() + " - " + sortedCapitals.getValue());
			
		}
		
		/* Conclusions: 
		 * 1- Si buidem la LinkedHashMap prèviament amb el mètode lhm.clear(): el resultat és la llista de dades
		 * endreçada alfabèticament per l'ArrayList.
		 * 2- Si no buidem la LinkedHashMap amb el mètode lhm.clear() manté la ordenació original perque al traspassar
		 * de l'ArrayList a LinkedHashMap no admet entrades duplicades, per tant es manté l'ordre d'inserció original.
		 * 
		 */
		
	}

}
