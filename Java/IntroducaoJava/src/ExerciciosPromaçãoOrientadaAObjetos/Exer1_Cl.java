/*
  
  
  
 Crie uma classe cliente e apresente 
os atributos e métodos referentes
esta classe, em seguida crie um objeto
 cliente, defina as instancias deste
objeto e apresente as informações
 deste objeto no console.

 
 
 */



package ExerciciosPromaçãoOrientadaAObjetos;
 

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
			
				System.out.println("Informação adicionada");
		
			else
				System.out.println("Informação não adicionada");
	}

	
	public void status()
	{
		System.out.println("O seu nome é: " +this.nome);
		System.out.println("A sua idade é: " +this.idade);
		System.out.println("O seu endereço é: " +this.endereco);
		System.out.println("O seu telefone é: " +this.telefone);
		System.out.println("Essa informação foi adicionado? " +this.add);
		
	}
		
}
