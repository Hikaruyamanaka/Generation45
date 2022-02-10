package ProjetoGenSnackBar;

public class Sobremesas implements Produtos {

	private int id;
	private String nome;
	private double preco;

	public Sobremesas(int i, String n, double p) {
		this.id = i;
		this.nome = n;
		this.preco = p;
	}

	@Override
	public void selecionar() {

	}

	@Override
	public void receberPedido() {
	}

	// public void add(Lanches l1) {
	// }
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void preco(double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "" + this.id + " \t " + this.nome + " \t R$" + this.preco + " \n";
		// return "O seu pedido foi um "+this.nome+", no valor de R$"+this.preco+"
		// reais";
	}

	@Override
	public void linhaDetalhe() {
		System.out.println("\t\t\t\t\t");

	}

}