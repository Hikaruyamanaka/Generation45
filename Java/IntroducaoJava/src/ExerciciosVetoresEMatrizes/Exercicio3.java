/*



3 - Escreve um programa que l� duas matrizes N1 (4,6) e
 N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos
 elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as 
dos elementos de mesma posi��o das matrizes N1 e N2.



*/



package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int n1[][] = new int [4][6];
		int n2[][] = new int [4][6];
		int mat[][] = new int [4][6];
		int mat2[][] = new int [4][6];
		int linha = 0, coluna = 0, x = 0, y = 0;
		
		for(linha = 0; linha <4; linha ++)
		{
			
			for(coluna =0; coluna <6; coluna ++)
			{
				
				System.out.println("Digite um n�mero para a primeira matriz: ");
				n1[linha][coluna] = leia.nextInt();
		
				x = n1[linha][coluna];
			
				System.out.println("Digite um n�mero para a segunda matriz: ");
				n2[linha][coluna] = leia.nextInt();
				
				y = n2[linha][coluna];
			
				mat[linha][coluna] = x + y;
				mat2[linha][coluna] = x - y;
				
				System.out.println("\n");
				
			}
			
		}
			
		for(linha = 0; linha < 4; linha ++)
		{
			
			for(coluna = 0; coluna < 6; coluna ++)
			{
			
				System.out.print(mat[linha][coluna] +"\t");
				
			}
			
				System.out.println("\n");
						
		}
			
		for(linha = 0; linha < 4; linha ++)
		{
			
			for(coluna = 0; coluna < 6; coluna ++)
			{
				
				System.out.print(mat2[linha][coluna] +"\t");
				
			}
			
				System.out.println("\n");
			
		}
			
	}	
		
}		
		