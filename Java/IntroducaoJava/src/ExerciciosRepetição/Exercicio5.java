/*



5-	Crie um programa que leia um n�mero
 do teclado at� que encontre um n�mero
  igual a zero. No final, mostre a soma
   dos n�meros digitados.(DO...WHILE)



*/


package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio5 
{

	public static void main(String[] args) 
	{
		
		int x, soma = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			
			System.out.println("Digite um n�mero: ");
			x = leia.nextInt();
			soma += x;
			
		}
		
		while(x != 0);
		
		System.out.println("A soma dos n�meros �: "+soma);
	
		leia.close();
		
	}
	
}
