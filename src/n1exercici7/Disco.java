package n1exercici7;

public class Disco {
	
	private String name;
	private int yearRelease;
	
	public Disco(String name, int yearRelease) {
		
		this.name = name;
		this.yearRelease = yearRelease;
		
	}
	
	public String toString() {
		
		return "Nombre del disco: " + this.name + "\nAño: " + this.yearRelease; 
		
	}
	

}
