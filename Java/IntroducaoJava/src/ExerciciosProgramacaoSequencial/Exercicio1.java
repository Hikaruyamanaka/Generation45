package ExerciciosProgramacaoSequencial;

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {	
		
		int anos, dias, meses, idade ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos voc? tem?: ");
		anos = leia.nextInt();
				
		System.out.println("Quantos meses voc? tem?: ");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias voc? tem?: ");
		dias = leia.nextInt();
		
	
		idade = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias ?: "+ idade);
			 
		leia.close();
		
	}
	
}
	
