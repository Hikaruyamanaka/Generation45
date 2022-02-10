package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class Exercicio1
{

	public static void main(String[] args) 
	{
		
		int p, i , m;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso dos tomates: ");
		p=leia.nextInt();
		
		if(p>50) 
		{
			i=p-50;
			m=4*i;
		}
		
		else 
		{
			i=0;
			m=0;
		}
		
		System.out.println("O valor do excedido é "+i+" e o valor da multa é "+m);
		
		leia.close();
		
	}

}
