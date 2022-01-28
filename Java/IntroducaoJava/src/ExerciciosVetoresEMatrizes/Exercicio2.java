/*


2 - Um dado é lançado 10 vezes e o valor correspondente
é anotado. Faça um programa que gere um vetor com os
lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize
e apresente também quantas foram as ocorrências da maior pontuação.



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
		
			System.out.println("Digite um número: ");
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
			
			System.out.println("\nA média dos valores lançados é: " +media);
			System.out.println("\nA maior pontuação ocorreu " +cont+ " vezes.");
			
	}
	
}