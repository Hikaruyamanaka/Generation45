/*
  
  
  
 Crie uma classe cliente e apresente 
os atributos e m�todos referentes
esta classe, em seguida crie um objeto
 cliente, defina as instancias deste
objeto e apresente as informa��es
 deste objeto no console.

 
 
 */



package ExerciciosProma��oOrientadaAObjetos;
 

public class Exer1_Cl {

	String nome, endereco;
	int idade, telefone;
	boolean add;
	
	
	public void adicionado()
	{
		this.add = true;
	}
	
	public void nao_adicionado()
	{
		this.add = false;
	}
	
	public void escrever()
	{
			if(this.add == add) 
			
				System.out.println("Informa��o adicionada");
		
			else
				System.out.println("Informa��o n�o adicionada");
	}

	
	public void status()
	{
		System.out.println("O seu nome �: " +this.nome);
		System.out.println("A sua idade �: " +this.idade);
		System.out.println("O seu endere�o �: " +this.endereco);
		System.out.println("O seu telefone �: " +this.telefone);
		System.out.println("Essa informa��o foi adicionado? " +this.add);
		
	}
		
}
