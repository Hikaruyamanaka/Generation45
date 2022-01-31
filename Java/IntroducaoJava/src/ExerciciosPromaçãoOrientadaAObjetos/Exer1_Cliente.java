package ExerciciosPromaçãoOrientadaAObjetos;

public class Exer1_Cliente {

	public static void main(String[] args) {
		
		Exer1_Cl cliente1= new Exer1_Cl();
		
		
		cliente1.nome = "Marcel";
		cliente1.idade = 29;
		cliente1.endereco = "Rua Eucalipto, 792, Mauá - SP";
		cliente1.telefone = 948436466;
		cliente1.adicionado();
		cliente1.escrever();
		cliente1.status();

	}

}
