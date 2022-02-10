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
			System.out.println("Digite um n�mero para fazer a divis�o: ");
			n=ler.nextInt();
			
			System.out.println(30/n);
			
		}
		
		catch(InputMismatchException erro)
		{
			System.out.println("ERRO!! Voc� deve digitar um n�mero inteiro "+ erro);		
		}
		
		catch(ArithmeticException erro)
		{
			do 
			{
				System.out.println("ERRO!! N�o � poss�vel a divis�o por zero");
				System.out.println("Digite um n�mero para fazer a divis�o: ");
				n=ler.nextInt();
			}
			
			while(n==0);		
		
		}
		System.out.println("FIM DO PROGRAMA");
		
		ler.close();
		
	}

}
