/*
 
 
 
2 - Crie uma classe avi�o e apresente os atributos e
m�todos referentes esta classe, em seguida crie
um objeto avi�o, defina as instancias deste objeto
 e apresente as informa��es deste objeto no console.



*/



package ExerciciosProma��oOrientadaAObjetos;

public class Exer2_Avi {
	
	String modelo, cor, peso;
	float tamanho;
	boolean parado;
	
	public void voar()
	{
		this.parado = true;
	}
	
	public void chao()
	{
		this.parado = false;
	}

	public void escrever()
	{
		if(this.parado == true)
			System.out.println("Impossibilitado de voar ");
	
		else
			System.out.println("Iniciando decolagem ^u^");
	}
	
	public void status()
	{
		System.out.println("O modelo desse avi�o �: " +this.modelo);
		System.out.println("O tamanho desse avi�o �: " +this.tamanho);
		System.out.println("A cor do avi�o �: " +this.cor);
		System.out.println("O peso do avi�o �: " +this.peso);
	}
	
}
