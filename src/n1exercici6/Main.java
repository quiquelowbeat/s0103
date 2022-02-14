package n1exercici6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		getPosition(list).add(7);
		getPosition(list).add(11);
		getPosition(list).add(3);
		getPosition(list).add(77);
		getPosition(list).add(34);
		getPosition(list).add(111);
		getPosition(list).add(390);
		getPosition(list).add(25);
		getPosition(list).add(13);
		getPosition(list).add(9);
		getPosition(list).add(8);
		getPosition(list).add(43);
		
		
		for(Integer i: list) {
			
			System.out.println(i);
			
			
		}
	
	}
	
	public static ListIterator getPosition(LinkedList list) {
		
		ListIterator<Integer> it = list.listIterator((list.size() + 1) / 2);
		
		return it;
		
	}

}
