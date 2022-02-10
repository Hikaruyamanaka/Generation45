package ExerciciosLacosCondicionais;
import java.util.Scanner;
/*
 * escolha -> switch
 * caso-> case
 * pare-> break
 * caso contrario -> default
 */
public class ExemploSwitch {

	public static void main(String[] args) {
		
		String x;
		System.out.println("Digite uma letra: ");
		Scanner ler = new Scanner(System.in);
		x=ler.nextLine();
		
		switch(x)	
		{
			case "a":
				System.out.println("Vogal");
				break;
			case "e":
				System.out.println("Vogal");
				break;
			case "i":
				System.out.println("Vogal");
				break;
			case "o":
				System.out.println("Vogal");
				break;
			case "u":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
		
		}
		
		ler.close();
		
	}
	
}
