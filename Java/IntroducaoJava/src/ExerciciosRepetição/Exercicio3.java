/*


Solicitar a idade de várias pessoas e imprimir: 
Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. 
O programa termina quando
idade for =-99. (WHILE)


*/

package ExerciciosRepetição;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int x = 0, idade_maior = 0, idade_menor = 0;

		Scanner leia = new Scanner(System.in);

		while (x != -99)

		{

			System.out.println("Digite a sua idade: ");
			x = leia.nextInt();

			if (x <= 21) 
			{
				
				idade_menor ++;

			}
			
			if (x >= 50)
			{
				
				idade_maior ++;
				
			}
			
			leia.close();
			
		}

		System.out.println("\nResultado de pessoas com menos de 21 anos é: "+idade_menor);
		System.out.println("Resultado de pessoas com mais de 50 anos é: "+idade_maior);
	
	}

}
