package ExerciciosPromaçãoOrientadaAObjetos;

public class Exer2_Aviao 
{
	
	public static void main(String[] args) 
	{
		Exer2_Avi aviao1 = new Exer2_Avi();
	
		aviao1.modelo = "A319";
		aviao1.tamanho = 33.84f;
		aviao1.cor = "branco, azul e vermlho";
		aviao1.peso = "40.800 toneladas";
		aviao1.voar();
		aviao1.escrever();
		aviao1.status();
	
	}

}
