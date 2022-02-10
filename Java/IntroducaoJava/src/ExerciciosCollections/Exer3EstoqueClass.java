package ExerciciosCollections;

public class Exer3EstoqueClass 
{
		private String produto;
		private int quantidade;
	
		public Exer3EstoqueClass(String x, int n) 
		{
		this.produto = x;
		this.quantidade = n;
		}
		
		public void setProduto(String produto) 
		{
		this.produto = produto;
		}
		
		public int getQuantidade() 
		{
			return quantidade;
		}
		
		public void setQuantidade(int quantidade)
		{
			this.quantidade = quantidade;
		}
		
		public String toString() 
		{
			return  this.produto+", " +this.quantidade+ " unidades";
		
		}

}
