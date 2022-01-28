/*
  
  
  
 4 - Crie um programa que receba valores do usuário para 
 preencher uma matriz 3X3, e em seguida, exiba a soma
 dos valores dela e a soma dos valores da primeira
 diagonal, ou seja, diagonal principal. 

 
 
 */



package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int mat[][] = new int[3][3];
		int soma_total = 0, soma_diag = 0, x, y;
		
		for(x = 0; x < 3; x ++)
		{
			
			for(y= 0; y < 3; y ++)
			{
				
				System.out.println("Digite um valor: ");
				mat[x][y] = leia.nextInt();
				
				soma_total = soma_total + mat[x][y];	
				
			}
			
		}
		
		for(x = 0; x < 3; x ++)
		{
			
			soma_diag = soma_diag + mat[x][x];
			
		}
		
			System.out.println("A soma de todos os valores da matriz é: " +soma_total);
			System.out.println("A soma dos valores diagonais da matriz é: " +soma_diag);
						
	}
	
}