package n1exercici3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Generadora.nextCharacter(); // Testing.
		
		ArrayList<String> arrayCharacters = new ArrayList<>();
		
		LinkedList<String> linkedListCharacters = new LinkedList<>();
		
		HashSet<String> hashCharacters = new HashSet<>();
		
		LinkedHashSet<String> linkedHashCharacters = new LinkedHashSet<>();
		
		TreeSet<String> treeCharacters = new TreeSet<>();
		
		System.out.println("ArrayList:\n");	
		
		for(int i = 0; i < 6; i++) {
			
			arrayCharacters.add(Generadora.nextCharacter());
			System.out.println(arrayCharacters.get(i));
		
		}
		
		System.out.println("\nLinkedList:\n");	
		
		for(int i = 0; i < 6; i++) {
			
			linkedListCharacters.add(Generadora.nextCharacter());
			System.out.println(linkedListCharacters.get(i));
			
		}
		
		System.out.println("\nHashSet:\n");	
		
		for(int i = 0; i < 6; i++) {
			
			hashCharacters.add(Generadora.nextCharacter());
			
		}
		
		System.out.println(hashCharacters.toString());
		
		System.out.println("\nLinkedHashSet:\n");	
		
		for(int i = 0; i < 6; i++) {
			
			linkedHashCharacters.add(Generadora.nextCharacter());
			
		}
		
		System.out.println(linkedHashCharacters.toString());
		
		System.out.println("\nTreeSet:\n");	
		
		for(int i = 0; i < 6; i++) {
			
			treeCharacters.add(Generadora.nextCharacter());	
			
		}
		
		System.out.println(treeCharacters.toString());

	}

}
