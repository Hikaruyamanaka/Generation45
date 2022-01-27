/*

6-	Escrever um programa que receba vários números
 inteiros no teclado. E no final imprimir a média
  dos números múltiplos de 3. Para sair digitar 0(zero).
  (DO...WHILE)



*/


package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int x = 0, media = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			
			System.out.println("Digite um número: ");
			x =leia.nextInt();
					
			
			if(x % 3 == 0 && x != 0)
			{
				
				soma = x + soma;
				media ++;
				
			}
			
		}	
		
		while(x !=0);
		
		media = soma / media;
		
		System.out.println("A média final da soma é: "+media);
		
		leia.close();
	}

}
