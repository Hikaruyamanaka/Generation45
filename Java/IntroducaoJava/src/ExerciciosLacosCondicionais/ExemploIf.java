package ExerciciosLacosCondicionais;
/*
 * 	| | == ou
	&& == e

 */


import java.util.Scanner;

public class ExemploIf 
{

	public static void main(String[] args)
	{
		int x;
		
		Scanner ler =  new Scanner (System.in);
		
		System.out.println("Digite um numero: ");		
		x=ler.nextInt();
		
		if(x==5 || x==7)
		{
			System.out.println("O valor é 5 ou 7");
		}
		
		else if(x<5 && x>3)
		{
			System.out.println("O valor esta entre 5 e 3");
		}
		
		else 
		{
			System.out.println("O valo é maior que 5 ou menor que 3");
		}
		
		
		System.out.println("\n---------------------------");
		System.out.println("\nFIM DO PROGRAMA");

		ler.close();
		
	}

}
