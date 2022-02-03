package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Loja {

	public static void main(String[] args) 
	{
		String comida1 = "Arroz";
		String comida2 = "Feijão";
		String comida3 = "Ovo";
		
		ArrayList<String> comida = new ArrayList<>();
		
		System.out.println(comida);
		
		comida.add("Mercado");
		System.out.println(comida);
		
		
		comida.add(comida1);
		comida.add(comida2);
		comida.add(comida3);
		System.out.println(comida);
		
		comida.set(0, "Mantimentos");
		System.out.println(comida);
		
		System.out.println(comida.get(2));
		
		System.out.println(comida.size());
		
		
		System.out.println(comida.contains("Mantimentos"));
		System.out.println(comida.contains(comida3));
			
		
		Collections.sort(comida);
		System.out.println(comida);

		
		
		comida.remove(0);
		System.out.println(comida);
	
		
		
		comida.clear();
		System.out.println(comida);
		
		
		
	}

}