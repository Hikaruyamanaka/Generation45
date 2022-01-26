/*
 
	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.

*/


programa
{
	
	funcao inicio()
	{
		inteiro idade_dias, ano = 365, mes = 12, dia = 30

		escreva("Qual a sua idade em dias? \n")
		leia(idade_dias)

		escreva("\nMinha idade em anos: ", idade_dias/ano)
		
		escreva("\nMinha idade em meses: ", idade_dias/mes)
		
		escreva("\nMinha idade em dias: ", idade_dias/dia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */