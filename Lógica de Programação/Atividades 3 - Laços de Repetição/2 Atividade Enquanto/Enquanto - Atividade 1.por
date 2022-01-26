/*



1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
e apresente no final o total do somatório, a média e o total de valores lidos. 
O programa deve fazer as leituras dos valores enquanto o usuário 
estiver fornecendo valores positivos. Ou seja, o programa deve parar
quando o usuário fornecer um valor negativo.



*/




programa
{
	
	funcao inicio()
	{

		inteiro n1 = 0, soma = 0, soma2 = 0, media = 0

			

			
		enquanto(n1 >= 0)
		{
			
			escreva("\nDigite um número: \n")
			leia(n1)

			soma2++
			soma = n1 + soma
			media = soma/soma2
			
			//limpa()	 	
		}
			
			
			escreva("\n ------- Resultado Final --------\n")
			escreva("\n")
			
			escreva("\nA sua soma total é de: \n", soma)
			escreva("\n")
			
			escreva("\nA sua média é: \n", media)
			escreva("\n")
			
			escreva("\nA soma Total de valores lidos é: \n", soma2 )
			escreva("\n")
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */