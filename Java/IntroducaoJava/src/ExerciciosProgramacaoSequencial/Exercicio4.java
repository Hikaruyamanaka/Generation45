package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double a, b, c, d, r, s;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextFloat();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextFloat();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		
		d = (r + s) / 2;
				
		System.out.println("O resultado é: "+d);		
		
		leia.close();
		
	}

}
