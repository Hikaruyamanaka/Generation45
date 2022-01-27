package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
		
		Scanner leia =  new Scanner(System.in);
		
		System.out.println("Entre com as coordenadas do ponto de partida x1: ");
		x1 = leia.nextDouble();
		
		/*x1 = leia.nextDouble();y1 = leia.nextDouble(); */
		
		System.out.println("Entre com as coordenadas do ponto de partida y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Entre com as coordenadas do ponto de partida x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Entre com as coordenadas do ponto de partida y2: ");
		y2 = leia.nextDouble();
		
		d = (int) Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
		
		
		System.out.println("A distância entre os pontos é: "+d);
		
		leia.close();
		
	}

}







