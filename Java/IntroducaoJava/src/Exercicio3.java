import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		double tempo, hora, minutos, segundos, resto;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo em segundos: ");
		tempo = leia.nextDouble();
		
		hora = tempo / 3600;
		resto = tempo % 3600;
		minutos = resto / 60;
		segundos = resto / 60;
		
		System.out.println("O tempo de duração do evento é " +hora+ " horas, " +minutos+ " minutos e " +segundos+ " segundos");
	
		leia.close();
		
	}

}
