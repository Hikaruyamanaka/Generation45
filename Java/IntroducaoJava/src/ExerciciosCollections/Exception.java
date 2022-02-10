package ExerciciosCollections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception 
{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		
		int n=0;
		
		try 
		{
			System.out.println("Digite um número para fazer a divisão: ");
			n=ler.nextInt();
			
			System.out.println(30/n);
			
		}
		
		catch(InputMismatchException erro)
		{
			System.out.println("ERRO!! Você deve digitar um número inteiro "+ erro);		
		}
		
		catch(ArithmeticException erro)
		{
			do 
			{
				System.out.println("ERRO!! Não é possível a divisão por zero");
				System.out.println("Digite um número para fazer a divisão: ");
				n=ler.nextInt();
			}
			
			while(n==0);		
		
		}
		System.out.println("FIM DO PROGRAMA");
		
		ler.close();
		
	}

}
