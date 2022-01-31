/*



3) Crie uma classe produto eletr�nico e apresente 
os atributos e m�todos referentes esta classe,
em seguida crie um objeto produto eletr�nico, defina 
as instancias deste objeto e apresente as informa��es
deste objeto no console.



*/



package ExerciciosProma��oOrientadaAObjetos;

public class Exer3_ProdElet 
{

	String marca, cor, peso, modelo;
	float tamanho;
	int bateria;
	boolean desligado;
	
	public Exer3_ProdElet(int quantidade, String v)
	{
		this.desligado = true;
		this.bateria = quantidade;
		this.cor = v;
	}
	
	public void on()
	{
		this.desligado = true;
	}
	
	public void off()
	{
		this.desligado = false;
	}
	
	public void escrever()
	{
		if(this.desligado == desligado)
			System.out.println("Celular desligado.");
		
		else
			System.out.println("Ligando...");
	}
	
	public void status()
	{
		System.out.println("A marca deste celular �: " +this.marca);
		System.out.println("A cor deste celular �: " +this.cor);
		System.out.println("O peso deste celular �: " +this.peso+ " kgs");
		System.out.println("O modelo deste celular �: " +this.modelo);
		System.out.println("O tamanho dele �: " +this.tamanho);
		System.out.println("A bateria dele est� em: " +this.bateria+ " %");
		System.out.println("Seu celular est� ligado? " +this.desligado);
	
	}
	
	
}
