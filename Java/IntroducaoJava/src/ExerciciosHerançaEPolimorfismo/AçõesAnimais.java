package ExerciciosHeran�aEPolimorfismo;

public class A��esAnimais
{

	public static void main(String[] args)
	{
		CachorroAnim cachorro = new CachorroAnim();
		CavaloAnim cavalo = new CavaloAnim();
		PreguicaAnim preguica = new PreguicaAnim();
		
		
		cachorro.setNome("Coragem");
		cachorro.setIdade(13);
		cachorro.setAcao("Correr ou fugir");
		
		
		cavalo.setNome("�pona");
		cavalo.setIdade(15);
		cavalo.setAcao("Correr");
		
		
		preguica.setNome("Hikaru");
		preguica.setIdade(29);
		preguica.setAcao("Subir em �rvore para dormir");
		
		
		
		System.out.println("------RESULTADO------");
		
		
		System.out.println("\n");
		
		
		System.out.println("O meu cachorro se chama: " +cachorro.getNome()+"\n"
		+ "Ele tem " +cachorro.getIdade()+ " anos\n" + "A a��o dele �: " +cachorro.getAcao());
		
		
		cachorro.emitirSom();
		
		
		System.out.println("\n");
		
		
		System.out.println("O meu cavalo se chama: " +cavalo.getNome()+"\n"
				+ "Ele tem " +cavalo.getIdade()+ " anos\n" + "A a��o dele �: " +cavalo.getAcao()); 
		
		
		cavalo.emitirSom();
		
		
		System.out.println("\n");
		
		
		System.out.println("O meu pregui�a se chama: " +preguica.getNome()+"\n"
				+ "Ele tem " +preguica.getIdade()+ " anos\n" + "A a��o dele �: " +preguica.getAcao());

		
		preguica.emitirSom();

	}

}
