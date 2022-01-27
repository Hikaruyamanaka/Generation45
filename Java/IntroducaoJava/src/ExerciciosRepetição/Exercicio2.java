/*
 
 Ler 10 números e imprimir quantos são 
 pares e quantos são ímpares. (FOR)
 
 
 */

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) 
	{
		int x, y, par = 0, impar = 0;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++)
		{
			System.out.println("Digite os números: ");
			y = leia.nextInt();

			if (y % 2 == 0) 
				
			{
				par++;
				
			}

			else 
			{
				
				impar++;
			
			}
			leia.close();
		}
		
		System.out.println("Quantidade de números pares : "+par);
		System.out.println("Quantidade de números impares: "+impar);
	
		
		
	}
	
	

}
