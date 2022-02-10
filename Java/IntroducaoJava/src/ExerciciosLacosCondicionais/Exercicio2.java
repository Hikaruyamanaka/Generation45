package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{

		@SuppressWarnings("unused")
		double cod, num, extras, salTot, salEx;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Entre com o código: ");
		cod = leia.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas: ");
		num= leia.nextDouble();
		
		if(num>50)
		{
			extras=num-50;
			salEx=extras*20;
			salTot=(50*10)+salEx;
		}
		
		else 
		{
			extras=0.0;
			salEx=0.0;
			salTot=num*10;
		}
		
		System.out.println("O salário total é: "+salTot+" e o salário excedente é: "+salEx);
	
		leia.close();
	
	}

}
