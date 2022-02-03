package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Locadora 
{
	public static void main(String[] args) 
	{
		Loja2 filme1 = new Loja2("Naruto", 20);
		Loja2 filme2 = new Loja2("One Piece", 20);
		Loja2 filme3 = new Loja2("Fairy Tail", 120);
	
	
		ArrayList<Loja2> filmes = new ArrayList<>();
		
		filmes.add(filme1);
		filmes.add(filme2);
		filmes.add(filme3);
	
		System.out.println(filmes);
		
		// Collections.sort(filmes);
		
	}

}
