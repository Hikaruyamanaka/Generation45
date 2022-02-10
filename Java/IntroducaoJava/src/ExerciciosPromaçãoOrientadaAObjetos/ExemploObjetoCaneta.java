/*
 * Caracter�sticas -> atributos
 * Comportamentos -> m�todos, o que a caneta pode fazer
 */
package ExerciciosProma��oOrientadaAObjetos;

public class ExemploObjetoCaneta {
	
	//ATRIBUTOS
	String cor;
	float ponta;
				// tamanho da ponta
	int carga; 
				// quantos % ela est� carregada
	boolean tampada;
				//sim ou n�o
	
	//M�TODO CONSTRUTOR -> para criar uma forma default para o meu objeto
	
	public ExemploObjetoCaneta(int valor, String v) {
		this.tampada=true;
		this.carga=valor;
		this.cor=v;
		
	}
	public ExemploObjetoCaneta() {
		this.tampada=true;		
	}
	
	//M�TODOS
	public void tampar()
	{
		// m�todo void s� executa a tarefa, n�o traz informa��es de volta
		this.tampada=true;
	}
	public void destampar() {
		this.tampada=false;
	}
	public void escrever() {
		if(this.tampada==true) 
			System.out.println("Erro!!! Caneta est� tampada");
		else
			System.out.println("Escrevendo...");	
	}
	
	public void status() {
		System.out.println("A cor da caneta �: "+this.cor);
		System.out.println("A ponta �: "+this.ponta);
		System.out.println("Est� tampada?" +this.tampada);
		System.out.println("A carga est� em "+this.carga+"%");
	}
	
}	
