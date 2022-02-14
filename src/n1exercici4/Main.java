package n1exercici4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayInt= new ArrayList<>();
			
		LinkedList<Integer> linkedListInt = new LinkedList<>();
				
		HashSet<Integer> hashInt = new HashSet<>();
			
		LinkedHashSet<Integer> linkedHashInt = new LinkedHashSet<>();
			
		TreeSet<Integer> treeInt = new TreeSet<>();
			
		for(int i = 0; i < 10; i++) {
			
			arrayInt.add((int) (Math.random() * 15) + 1);
			linkedListInt.add((int) (Math.random() * 15) + 1);
			hashInt.add((int) (Math.random() * 15) + 1);
			linkedHashInt.add((int) (Math.random() * 15) + 1);
			treeInt.add((int) (Math.random() * 15) + 1);
			
		}
		
		iterateCollection(arrayInt);
		iterateCollection(linkedListInt);
		iterateCollection(hashInt);
		iterateCollection(linkedHashInt);
		iterateCollection(treeInt);
		
		// System.out.println(arrayInt);
		
		
		// Iterator<Integer> it = arrayInt.iterator();
		
		
	
	}
	
	public static void iterateCollection(Object obj) {
		
		if(obj instanceof ArrayList) {
			
			Iterator<Integer> it = ((ArrayList) obj).iterator();
			
			System.out.println("\nArrayList:\n");
			
			while(it.hasNext()) {
				
				System.out.println(it.next().toString());
				
			}
			
		} else if(obj instanceof LinkedList){
			
			Iterator<Integer> it = ((LinkedList) obj).iterator();
			
			System.out.println("\nLinkedList:\n");
			
			while(it.hasNext()) {
				
				System.out.println(it.next().toString());
				
			}
			
		} else if(obj instanceof HashSet) {
			
			Iterator<Integer> it = ((HashSet) obj).iterator();
			
			System.out.println("\nHashSet:\n");
			
			while(it.hasNext()) {
				
				System.out.println(it.next().toString());
				
			}
			
		} else if(obj instanceof LinkedHashSet) {
			
			Iterator<Integer> it = ((LinkedHashSet) obj).iterator();
			
			System.out.println("\nLinkedHashSet:\n");
			
			while(it.hasNext()) {
				
				System.out.println(it.next().toString());
				
			}
		
		} else if(obj instanceof TreeSet) {
			
			Iterator<Integer> it = ((TreeSet) obj).iterator();
			
			System.out.println("\nTreeSet:\n");
			
			while(it.hasNext()) {
				
				System.out.println(it.next().toString());
				
			}
		}
		
		
	}

}
