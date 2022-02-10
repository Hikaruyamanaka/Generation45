package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection
{

	public static void main(String[] args) 
	{
		
	String aula1 ="Bloco I";
	String aula2 ="Bloco II";
	String aula3 ="Bloco III";	
		
	ArrayList<String>	aula = new ArrayList<>();
	
	aula.add("Feira de empregabilidade");
	
	System.out.println(aula);
	
	//adicionando itens na array
	aula.add(aula1);
	aula.add(aula2);
	aula.add(aula3);
	
	System.out.println(aula);
	
	// mudando algum espaço já prenchido
	aula.set(0, "Matrícula");
	System.out.println(aula);
	
	//buscar infos com get
	System.out.println(aula.get(2));
	
	// tamanhp da minha array
	System.out.println(aula.size());
	
	// ordem alfabética
	Collections.sort(aula);
	
	// se está vazia
	if(aula.isEmpty())
	{
		System.out.println("Lista Vazia...");
	}
	
	
	System.out.println(aula.contains("Matrícula"));
	System.out.println(aula.contains(aula2));
	
	//remover um item da array
	
	aula.remove(1);
	
	System.out.println(aula);
	
	// adicionar de outra coleção
	//Collection nomes = Arrays.asLists("João","Joana");
	///aula.addAll(nomes);
	//System.out.println(aula);
	
	// limpar totalmente a array
	//aula.clear(aula);
	//System.out.println("aula");
	
	}
	
}
