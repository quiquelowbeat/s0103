package n1exercici3;

public class Generadora {

	private static String[] characters = {"C3PO", "R2D2", "Obi Wan Kenobi", "Luke Skywalker", "Princess Leia", "Darth Vader"};
	private static int index = -1;
	
	// Mètode return personatge
	
	public static String nextCharacter() {
		
		index++;
		
		if(index > 5) {
			
			index = 0;
			
		}
		
		return characters[index];
	
	}
	
}
