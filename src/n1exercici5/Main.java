package n1exercici5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.addAll(getRandomInt());
		list2.addAll(getRandomInt());
		
	
		ListIterator<Integer> it1 = list1.listIterator(list1.size());
		ListIterator<Integer> it2 = list2.listIterator(list2.size());
		
		System.out.println(list1);
		System.out.println(list2);
		
		// Bucle per emplenar la llista 2 amb la llista 1 a la inversa.
		
		while(it1.hasPrevious()) {
			
			it2.add(it1.previous());
			
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
	}
	
	public static HashSet getRandomInt() {
		
		HashSet<Integer> hashInt = new HashSet<>();
		
		for(int i = 0; hashInt.size() != 15; i++) {
			
			hashInt.add((int) (Math.random() * 100) + 1);
			
		}
		
		return hashInt;
	}

}
