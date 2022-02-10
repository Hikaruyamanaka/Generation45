package ExerciciosPromaçãoOrientadaAObjetos;

import java.util.Scanner;

public class ExemploAulaCaneta {

	public static void main(String[] args) {
		int x;
		String m="Rosa";
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a carga da caneta: ");
		x=ler.nextInt();

		ExemploObjetoCaneta c0= new ExemploObjetoCaneta(x,m);
		c0.status();
	
		// Atribuindo valores manualmente
		System.out.println("\n");
		ExemploObjetoCaneta c1= new ExemploObjetoCaneta();
	
		c1.cor="Azul";
		c1.ponta=0.5f;
		c1.tampar();
		c1.carga=80;
		c1.status();
		c1.escrever();
		
		// destampando a caneta
		
		System.out.println("\n");
		ExemploObjetoCaneta c2= new ExemploObjetoCaneta();
		
		c2.cor="vermelha";
		c2.ponta=0.7f;
		c2.destampar();
		c2.carga=30;
		c2.status();
		c2.escrever();
		
		ler.close();
		
	}
	
}
