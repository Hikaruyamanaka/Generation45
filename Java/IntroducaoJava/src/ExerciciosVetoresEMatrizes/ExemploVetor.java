package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class ExemploVetor 
{

	public static void main(String[] args)
	{
		
		int soma=0, maior=0;
		int[]vet= new int[50];
		
		Scanner ler = new Scanner(System.in);
		
		for( int x=0; x<50 ; x++) 
		{
			
			System.out.println("Digite um número: ");
			
			vet[x]= ler.nextInt();
			soma=soma+vet[x];
			
			if(vet[x]>maior) 
			{
				maior=vet[x];
			}
					
		}
		
		System.out.println("A soma dos valores é: "+ soma);
		
		System.out.println("O maior valor digitado é: "+ maior);
	
		ler.close();
		
	}
	
}
