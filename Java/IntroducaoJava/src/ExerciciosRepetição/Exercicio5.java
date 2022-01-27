/*



5-	Crie um programa que leia um número
 do teclado até que encontre um número
  igual a zero. No final, mostre a soma
   dos números digitados.(DO...WHILE)



*/


package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio5 
{

	public static void main(String[] args) 
	{
		
		int x, soma = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			soma += x;
			
		}
		
		while(x != 0);
		
		System.out.println("A soma dos números é: "+soma);
	
		leia.close();
		
	}
	
}
