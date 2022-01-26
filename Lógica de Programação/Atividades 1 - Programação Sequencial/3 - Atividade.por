/*

	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.

*/


programa
{
	
	funcao inicio()
	{
		inteiro tempo
		

		escreva("Quanto tempo o evento irá durar em segundos? \n")
		
		leia(tempo)
		

		inteiro tempo_horas = (tempo/3600), tempo_horas2 = (tempo%3600)
		
		
		escreva("\n\nDuração do tempo em horas: \n", (tempo/3600),

		"\n\nDuração do tempo em minutos: \n", (tempo%60),

		"\n\nDuração do tempo em segundos: \n", (tempo_horas2%3600))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */