package ExerciciosHerançaEPolimorfismo;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
				
				
		p1.setNome("Vera");
		p1.setIdade(60);
				
		p2.setNome("Camila");
		p2.setIdade(27);
		p2.aniversario();

		System.out.println(p1.getNome()+"\t"+p1.getIdade());
		System.out.println(p2.getNome()+"\t"+p2.getIdade());
				
	}

}
