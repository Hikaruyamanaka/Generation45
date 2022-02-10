package ExerciciosRepetição;

import java.util.Scanner;

public class ExemploWhile 
{

	public static void main(String[] args)
	{

		int n1, n2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que será dividido: ");
		n1=leia.nextInt();
		
		System.out.println("Digite o número divisor: ");
		n2=leia.nextInt();
		
		while(n2!=0) 
		{
			System.out.println("A divisão é "+n1/n2);
			
			System.out.println("\nDigite o número que será dividido: ");
			n1=leia.nextInt();
			
			System.out.println("Digite o número divisor: ");
			n2=leia.nextInt();	
		
			leia.close();
			
		}

	}

}
