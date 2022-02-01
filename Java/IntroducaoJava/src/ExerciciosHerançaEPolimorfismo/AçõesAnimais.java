package ExerciciosHerançaEPolimorfismo;

public class AçõesAnimais
{

	public static void main(String[] args)
	{
		CachorroAnim cachorro = new CachorroAnim();
		CavaloAnim cavalo = new CavaloAnim();
		PreguicaAnim preguica = new PreguicaAnim();
		
		cachorro.setNome("Coragem");
		cachorro.setIdade(13);
		cachorro.setAcao("Correr ou fugir");
		cachorro.setSom(true);
		
		cavalo.setNome("Épona");
		cavalo.setIdade(15);
		cavalo.setAcao("Correr");
		cavalo.setSom(true);
		
		preguica.setNome("Hikaru");
		preguica.setIdade(29);
		preguica.setAcao("Subir em árvore para dormir");
		preguica.setSom(false);
		
		
		System.out.println("------RESULTADO------");
		
		System.out.println("\n");
		
		System.out.println("O meu cachorro se chama: " +cachorro.getNome()+"\n"
		+ "Ele tem " +cachorro.getIdade()+ " anos\n" + "A ação dele é: " +cachorro.getAcao()+ 
		"\n" + "E ele chora? " +cachorro.isSom());
		
		System.out.println("\n");
		
		System.out.println("O meu cavalo se chama: " +cavalo.getNome()+"\n"
				+ "Ele tem " +cavalo.getIdade()+ " anos\n" + "A ação dele é: " +cavalo.getAcao()+ 
				"\n" + "E ele Relincha? " +cavalo.isSom());
		
		System.out.println("\n");
		
		System.out.println("O meu preguiça se chama: " +preguica.getNome()+"\n"
				+ "Ele tem " +preguica.getIdade()+ " anos\n" + "A ação dele é: " +preguica.getAcao()+ 
				"\n" + "E ele boceja? " +preguica.isSom());

	}

}
