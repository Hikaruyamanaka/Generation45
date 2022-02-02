package ExerciciosHerançaEPolimorfismo;

public class CachorroAnim extends Animais
{
	private String acao;

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	@Override
		
	public void emitirSom()
	{
		System.out.println("Uaaaaauu auauuaua...");
	}
	
}
