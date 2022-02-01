/*
 
 
 
2 - Crie uma classe avião e apresente os atributos e
métodos referentes esta classe, em seguida crie
um objeto avião, defina as instancias deste objeto
 e apresente as informações deste objeto no console.



*/



package ExerciciosPromaçãoOrientadaAObjetos;

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
		System.out.println("O modelo desse avião é: " +this.modelo);
		System.out.println("O tamanho desse avião é: " +this.tamanho);
		System.out.println("A cor do avião é: " +this.cor);
		System.out.println("O peso do avião é: " +this.peso);
	}
	
}
