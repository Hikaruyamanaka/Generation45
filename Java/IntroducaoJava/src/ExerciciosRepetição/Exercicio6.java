/*

6-	Escrever um programa que receba v�rios n�meros
 inteiros no teclado. E no final imprimir a m�dia
  dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
  (DO...WHILE)



*/


package ExerciciosRepeti��o;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int x = 0, media = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			
			System.out.println("Digite um n�mero: ");
			x =leia.nextInt();
					
			
			if(x % 3 == 0 && x != 0)
			{
				
				soma = x + soma;
				media ++;
				
			}
			
		}	
		
		while(x !=0);
		
		media = soma / media;
		
		System.out.println("A m�dia final da soma �: "+media);
		
		leia.close();
	}

}
