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
		
		ArrayList<Map.Entry<String, String>> arrayCapitals = new ArrayList<>(lhm.entrySet());
		
		System.out.println("ArrayList unsorted:\n");
		
		for(Map.Entry<String, String> capitals : arrayCapitals) { // Test de que estigui ok.
			
			System.out.println(capitals.getKey() + " - " + capitals.getValue());
			
		}
		
		Collections.sort(arrayCapitals, new ComparatorMap());
		
		System.out.println("\nArrayList sorted:\n");
		
		for(Map.Entry<String, String> capitals : arrayCapitals) { 
			
			System.out.println(capitals.getKey() + " - " + capitals.getValue()); // Test per combrobar ordenació.
			lhm.put(capitals.getKey(), capitals.getValue());
			
		}
		
		System.out.println("\nArrayList to LinkedHashMap:\n");
		
		for(Map.Entry<String, String> sortedCapitals : lhm.entrySet()) {
			
			System.out.println(sortedCapitals.getKey() + " - " + sortedCapitals.getValue());
			
		}
		/* Conclusió: al passar de ArrayList a LinkedHashMap de nou, torna a endreçar els elements per
		 * ordre d'inserció. 
		 */
		
	}

}
