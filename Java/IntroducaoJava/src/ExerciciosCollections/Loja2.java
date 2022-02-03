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
	private double pre�o;
	
	
	public Loja2 (String n, double p)
	{
		this.nome = n;
		this.pre�o = p;
	}

	
	public String getNome() 
	{
		return nome;
	}

	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	
	public double getPre�o() 
	{
		return pre�o;
	}

	
	public void setPre�o(double pre�o) 
	{
		this.pre�o = pre�o;
	}

	
	public String toString()
	{
		return "Loja2" +this.nome+ ", R$" +this.pre�o+ ".";
	}

}



*/