package ExerciciosRepetição;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {

		int n1, n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1=leia.nextInt();
		System.out.println("Digite outro número: ");
		n2=leia.nextInt();
		
		do {
			System.out.println("A soma é "+ (n1+n2));
			System.out.println("\nDigite um número: ");
			n1=leia.nextInt();
			System.out.println("Digite outro número: ");
			n2=leia.nextInt();	
		}
		
		while(n1!=-1 || n2!=-1);
		
		leia.close();
		
	}
	
}
