/*
 * Características -> atributos
 * Comportamentos -> métodos, o que a caneta pode fazer
 */
package ExerciciosPromaçãoOrientadaAObjetos;

public class ExemploObjetoCaneta {
	
	//ATRIBUTOS
	String cor;
	float ponta;
				// tamanho da ponta
	int carga; 
				// quantos % ela está carregada
	boolean tampada;
				//sim ou não
	
	//MÉTODO CONSTRUTOR -> para criar uma forma default para o meu objeto
	
	public ExemploObjetoCaneta(int valor, String v) {
		this.tampada=true;
		this.carga=valor;
		this.cor=v;
		
	}
	public ExemploObjetoCaneta() {
		this.tampada=true;		
	}
	
	//MÉTODOS
	public void tampar()
	{
		// método void só executa a tarefa, não traz informações de volta
		this.tampada=true;
	}
	public void destampar() {
		this.tampada=false;
	}
	public void escrever() {
		if(this.tampada==true) 
			System.out.println("Erro!!! Caneta está tampada");
		else
			System.out.println("Escrevendo...");	
	}
	
	public void status() {
		System.out.println("A cor da caneta é: "+this.cor);
		System.out.println("A ponta é: "+this.ponta);
		System.out.println("Está tampada?" +this.tampada);
		System.out.println("A carga está em "+this.carga+"%");
	}
	
}	
