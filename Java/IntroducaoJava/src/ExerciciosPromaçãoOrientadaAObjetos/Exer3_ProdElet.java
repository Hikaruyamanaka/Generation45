/*



3) Crie uma classe produto eletrônico e apresente 
os atributos e métodos referentes esta classe,
em seguida crie um objeto produto eletrônico, defina 
as instancias deste objeto e apresente as informações
deste objeto no console.



*/



package ExerciciosPromaçãoOrientadaAObjetos;

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
		System.out.println("A marca deste celular é: " +this.marca);
		System.out.println("A cor deste celular é: " +this.cor);
		System.out.println("O peso deste celular é: " +this.peso+ " kgs");
		System.out.println("O modelo deste celular é: " +this.modelo);
		System.out.println("O tamanho dele é: " +this.tamanho);
		System.out.println("A bateria dele está em: " +this.bateria+ " %");
		System.out.println("Seu celular está ligado? " +this.desligado);
	
	}
	
	
}
