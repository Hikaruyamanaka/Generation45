/*
 
 Ler 10 n�meros e imprimir quantos s�o 
 pares e quantos s�o �mpares. (FOR)
 
 
 */

package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) 
	{
		int x, y, par = 0, impar = 0;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++)
		{
			System.out.println("Digite os n�meros: ");
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
		
		System.out.println("Quantidade de n�meros pares : "+par);
		System.out.println("Quantidade de n�meros impares: "+impar);
	
		
		
	}
	
	

}
