		/*
  
	1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
  
dias e mostre-a expressa apenas em dias.

*/


programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, idade_dias
	

		escreva("Quantos anos você tem? \n")
		leia(anos)

		escreva("Quantos meses faltam para o seu aniversário? \n")
		leia(meses)

		escreva("Quantos dias faltam para o seu aniversário? \n")
		leia(dias)

		meses = 12 - meses
		idade_dias = (anos*365) + (meses*30) + (dias)

		escreva("Você tem "+idade_dias+" dias de vida.")

	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */