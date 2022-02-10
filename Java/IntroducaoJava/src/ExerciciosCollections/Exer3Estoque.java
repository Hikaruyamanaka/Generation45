package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer3Estoque 
{
		public static void main(String[] args) 
		{
		
			Exer3EstoqueClass p1 = new Exer3EstoqueClass("Caderno", 50);
			Exer3EstoqueClass p2 = new Exer3EstoqueClass("Lápis", 150);
			Exer3EstoqueClass p3 = new Exer3EstoqueClass("Borracha", 90);
			Exer3EstoqueClass p4 = new Exer3EstoqueClass("Caneta", 85);
			
			String produto = " ";
			String px = produto;
			
			int qn = 0;
			int quantidade = qn;
			
			Scanner leia = new Scanner(System.in);
			
			
			ArrayList<Exer3EstoqueClass> lista = new ArrayList<>();
		
			lista.add(p1);
			lista.add(p2);
			lista.add(p3);
			lista.add(p4);
			
			System.out.println("Produtos do estoque:");
			System.out.println(lista);
			
			
			//Adicionando produto
			System.out.println("Adicione um produto: ");
			produto = leia.nextLine();
			
			System.out.println("Adicione a quantidade: ");
			quantidade = leia.nextInt();
			
			qn = quantidade;
			px = produto;
			
			Exer3EstoqueClass p5 = new Exer3EstoqueClass(px, qn);
			
			lista.add(p5);
			System.out.println(lista);
			
			//Remover dados da lista
			System.out.println("Qual item você gostaria de remover: (p1,p2,p3...)");
			System.out.println("p2");	
			
			//String r="";
			//r=leia.nextLine();
			//String remova = r;
			
			lista.remove(p2);
	
			System.out.println(lista);
		
			leia.close();
			
		}	

}
