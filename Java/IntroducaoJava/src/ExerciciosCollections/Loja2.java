package ExerciciosCollections;

import java.util.Collections;

public class Loja2 {

	private String nome;
	private int tempo;
	
	
	public Loja2 (String n, int t)
	{
		this.nome = n;
		this.tempo = t;
	}

	
	public String getNome() 
	{
		return nome;
	}

	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	
	public double getTempo() 
	{
		return tempo;
	}

	
	public void setTempo(int tempo) 
	{
		this.tempo = tempo;
	}

	
	public String toString()
	{
		return "Loja2: " +this.nome+ ", " +this.tempo+ " minutos";
	}

	
}











/*   Outra coisa...



package ExerciciosCollections;

public class Loja2 {

	private String nome;
	private double preço;
	
	
	public Loja2 (String n, double p)
	{
		this.nome = n;
		this.preço = p;
	}

	
	public String getNome() 
	{
		return nome;
	}

	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	
	public double getPreço() 
	{
		return preço;
	}

	
	public void setPreço(double preço) 
	{
		this.preço = preço;
	}

	
	public String toString()
	{
		return "Loja2" +this.nome+ ", R$" +this.preço+ ".";
	}

}



*/