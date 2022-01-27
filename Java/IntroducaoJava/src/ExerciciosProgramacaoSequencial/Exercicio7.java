package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os valores: ");
		a = leia.nextDouble(); b = leia.nextDouble(); c = leia.nextDouble(); 
		d = leia.nextDouble(); e = leia.nextDouble(); f = leia.nextDouble(); 
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.println("Os valores de X e Y são respectivamente: " +x+ " e " +y);
		
		leia.close();
		
	}

}
			