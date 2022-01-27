package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double cf, dist, imp, cc;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de Fábrica do veículo: ");
		cf = leia.nextDouble();
		
		dist = cf * 0.28;
		imp = cf * 0.45;
		cc = cf + dist + imp;
		
		System.out.println("O valor da venda do veículo é: " +cc);
		
		leia.close();
	
	}

}
