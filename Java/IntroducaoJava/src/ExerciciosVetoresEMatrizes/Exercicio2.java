/*


2 - Um dado � lan�ado 10 vezes e o valor correspondente
� anotado. Fa�a um programa que gere um vetor com os
lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize
e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.



*/



package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int vet[] = new int [10];
		int maior = 0, cont = 0, x;
		double soma = 0.0, media = 0.0;
		
		for(x = 0; x < 10; x++)
		{
		
			System.out.println("Digite um n�mero: ");
			vet[x] = leia.nextInt();
			
			if(vet[x] > maior)
			{
				
				maior = vet[x];
				
			}
				
			soma = soma + vet[x];
			
			leia.close();
			
		}
			
			System.out.println("Os valores digitados foram: ");
			
			for(x=0; x < 10; x++)
			{
				
				if(vet[x] == maior)
				{
					
					cont ++;
					
				}
				
				System.out.println(vet[x]+"\t");
				
			}
			
			media = soma/10;
			
			System.out.println("\nA m�dia dos valores lan�ados �: " +media);
			System.out.println("\nA maior pontua��o ocorreu " +cont+ " vezes.");
			
	}
	
}