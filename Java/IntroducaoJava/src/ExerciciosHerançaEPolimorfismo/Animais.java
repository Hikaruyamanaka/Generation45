/*



Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:



*/



package ExerciciosHerançaEPolimorfismo;

public class Animais 
{

	private String Nome;
	private int idade;
	private boolean som;
	
	void aniversario()
	{
		this.idade++;
	}

	
	public String getNome() 
	{
		return Nome;
	}

	public void setNome(String nome) {
		
		Nome = nome;
	}

	public boolean isSom() {
		return som;
	}


	public void setSom(boolean som) {
		this.som = som;
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
