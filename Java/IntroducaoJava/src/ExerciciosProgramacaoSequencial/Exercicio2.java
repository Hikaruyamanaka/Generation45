package ExerciciosProgramacaoSequencial;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int anos, meses, dias, idade, resto ;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade / 365;
		resto = idade % 365;
		meses = resto / 30;
		dias = resto % 30;
				
		System.out.println("Sua idade ?: "+anos+", anos, "+meses+", meses e "+dias+", dias");

		leia.close();
		
	}

}
