/*
  
  
 
 Crie uma classe funcion�rio e apresente os atributos
e m�todos referentes esta classe, em seguida crie
um objeto funcion�rio, defina as instancias deste
objeto e apresente as informa��es deste objeto no
console.

 
 
*/



package ExerciciosProma��oOrientadaAObjetos;

public class Exer4_Func {

	//atributos
	
    String nome, funcao;
    int idade;
    
    
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
            System.out.println("Sua fun��o: "+funcao);
        }

}