/*
 
   4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é positivo ou negativo.


 

 */
 
 
 
 programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("Digite um número: \n")
		leia(n)

		se (n < 0)
		{
			escreva("\nEste número é negativo.\n")
		}

		senao
		{
			escreva("\nEste número é positivo.\n")
		}


		n=(n%2)

		se(n==0)
		{
			escreva("\nEsse número é par.\n")
		}

		senao
		{
			escreva("\nEsse número é impar.\n")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */