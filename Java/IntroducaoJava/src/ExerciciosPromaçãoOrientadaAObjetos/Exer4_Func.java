/*
  
  
 
4 - Crie uma classe funcionário e apresente os atributos
e métodos referentes esta classe, em seguida crie
um objeto funcionário, defina as instancias deste
objeto e apresente as informações deste objeto no
console.

 
 
*/



package ExerciciosPromaçãoOrientadaAObjetos;

public class Exer4_Func 
{

	//atributos
	
    String nome, funcao;
    int idade;
    boolean trabalhando;
    boolean folga;
    
    //metodos

    public Exer4_Func() 
    {
        this.nome = "Roberto";
        this.idade = 52;
        this.funcao = "Professor";
    }
    	
        public void informarNome()
        {
            System.out.println("Seu nome: "+nome);
        }

        public void informarIdade()
        {
            System.out.println("Sua idade: "+idade);
        }

        public void informarfuncao()
        {
            System.out.println("Sua função: "+funcao);
        }
        
        public void trabalhar() 
        {
            trabalhando = true;
            System.out.println("O funcionario está na empresa");
        }

        public void folgar() 
        {
            trabalhando = false;
            System.out.println("O funcionario não está na empresa");
        }

        	public void escrever()
        	{
        		if (trabalhando == true) 
        		{
        			System.out.println("O funcionario pode executar a tarefa");
        		} 	
        		else    
            {
                System.out.println("O funcionario não pode executar a tarefa");
            }
        		
        }
        	
}