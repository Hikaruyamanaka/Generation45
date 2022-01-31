/*
  
  
 
 Crie uma classe funcionário e apresente os atributos
e métodos referentes esta classe, em seguida crie
um objeto funcionário, defina as instancias deste
objeto e apresente as informações deste objeto no
console.

 
 
*/



package ExerciciosPromaçãoOrientadaAObjetos;

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
            System.out.println("Sua função: "+funcao);
        }

}