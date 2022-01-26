import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media_final;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a prmeira nota: ");
		n1 = leia.nextDouble();
		n1 = (n1 * 2);
		
		System.out.println("Entre com a segunda nota: ");
		n2 = leia.nextDouble();
		n2 = (n2 * 3);
		
		System.out.println("Entre com a terceira nota: ");
		n3 = leia.nextDouble();
		n3 = (n3 * 5);
		
		media_final = (n1 + n2 + n3) / 10;
		
		System.out.println("A sua média ponderada é: " +media_final);
	
		leia.close();
	
	}

}
