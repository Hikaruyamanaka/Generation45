package ExerciciosPromaçãoOrientadaAObjetos;

public class Exer4_Funcionario {

	public static void main(String[] args) {

		Exer4_Func id = new Exer4_Func();
		
		System.out.println("Dados do Funcionário\n");

		Exer4_Func f1 = new Exer4_Func();
		// Para adicionar um segundo cadastro
		// Exer4_Func f2 = new Exer4_Func();

		id.informarNome();
		id.informarfuncao();
		id.informarIdade();

		f1.trabalhar();

		f1.escrever();

		f1.trabalhando = true;
		
	}

}