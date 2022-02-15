package n1exercici1;

import java.util.ArrayList;

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
		
		for(Month m: arrayMonth) {
			
			System.out.println(m.getName());
			
		}
	}

}
