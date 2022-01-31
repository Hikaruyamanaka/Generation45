package ExerciciosPromaçãoOrientadaAObjetos;

import java.util.Scanner;

public class Exer3_ProdutoEletronico 
{

	public static void main(String[] args) 
	{	
		
		int x;
		String y;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a carga: ");
		x = leia.nextInt();
		
		System.out.println("\nDigite a cor: ");
		y = leia.next();
		
				
		System.out.println("\n");
		
		Exer3_ProdElet celular1 = new Exer3_ProdElet(x, y);
		
		celular1.marca = "Samsung";
		celular1.peso = "171 gramas";
		celular1.modelo = "Galaxy s21";
		celular1.tamanho = 6.2f;
		celular1.off();
		celular1.escrever();
		celular1.status();
	
	}

}
