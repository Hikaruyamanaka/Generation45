package ExerciciosHerançaEPolimorfismo;

public class Pessoa 
{
	//ATRIBUTOS
	private String nome;
	private int idade;
	
	// MÉTODO
	
	public void aniversario() 
	{
		idade++;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	
	
}
