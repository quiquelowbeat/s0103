package n1exercici7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Disco> hipHopCollection = new HashMap<>(); // No manté l'ordre d'inserció ni endreça per clau.
		
		System.out.println("HashMap:\n");
		hipHopCollection.put("Snoop Dogg", new Disco("Doggystyle", 1993));
		hipHopCollection.put("Dr. Dre", new Disco("The Chronic 2001", 1999));
		hipHopCollection.put("Beastie Boys", new Disco("Licensed to Ill", 1986));
		hipHopCollection.put("Wu-tang Clan", new Disco("Enter the Wu-Tang (36 Chambers)", 1993));
		hipHopCollection.put("Outkast", new Disco("ATLiens", 1996));
		
		// System.out.println(hipHopCollection);
		
		for(Map.Entry<String, Disco> collect : hipHopCollection.entrySet()) {
			
			System.out.println("Clave: " + collect.getKey() + "\n" + collect.getValue() + "\n");
			
		}
		
		TreeMap<String, Disco> tr = new TreeMap<>(hipHopCollection); // Endreça el map per clau alfabèticament.
		
		System.out.println("\nTreeMap:\n");
		
		for(Map.Entry<String, Disco> collect : tr.entrySet()) {
			
			System.out.println("Clave: " + collect.getKey() + "\n" + collect.getValue() + "\n");
			
		}
		
		LinkedHashMap<String, Disco> lm = new LinkedHashMap<>(tr); // Manté l'ordre del TreeMap.
		// LinkedHashMap<String, Disco> lm = new LinkedHashMap<>(hipHopCollection); // Manté l'ordre original del HashMap.
		// Conclusió: el LinkedHashMap manté l'ordre d'inserció.
		
		System.out.println("\nLinkedHashMap:\n"); 
		
		for(Map.Entry<String, Disco> collect : lm.entrySet()) {
			
			System.out.println("Clave: " + collect.getKey() + "\n" + collect.getValue() + "\n");
			
		}
		
		HashSet<String> hs = new HashSet<>();
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		
		for(Map.Entry<String, Disco> collect : tr.entrySet()) { // Extrec les claus del TreeMap endreçades.
			
			hs.add(collect.getKey());
			ls.add(collect.getKey());
			
		}
		
		System.out.println(hs); // HashSet: manté ordre original del HashMap.
		System.out.println(ls); // LinkedHashSet: manté ordre per clau.

	}

}
