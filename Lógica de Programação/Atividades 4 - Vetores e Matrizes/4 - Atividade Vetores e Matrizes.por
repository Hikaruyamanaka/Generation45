/*



4.	Crie um programa que receba valores do usuário para preencher 
uma matriz 3X3, e em seguida, exiba a soma dos valores dela 
e a soma dos valores da primeira diagonal, ou seja, diagonal principal.



*/


programa
{
	
	funcao inicio()
	{

		inteiro  m[3][3], linha, coluna, soma_total = 0, soma_diag = 0

		para(linha=0;linha<3;linha++)
		{

			para(coluna=0;coluna<3;coluna++)
			{
				escreva("Digite um número: \n")
				leia(m[linha][coluna])
				
				escreva("\n")

				soma_total = soma_total + m[linha][coluna]

				

			se(linha==coluna)

				soma_diag = soma_diag + m[linha][coluna]

			}
		
		}


		limpa()
		
		escreva("--------------RESULTADOS E TABELA------------- \n\n")
		
		
		para(linha=0;linha<3;linha++)
		{

			para(coluna=0;coluna<3;coluna++)
			{		
				
				
				escreva("\t", m[linha][coluna])
				
								
			}
			
				escreva("\n\n")
				
		}
		
			escreva("\nA soma total dos números é: ",soma_total)
			escreva("\n")

			escreva("\nA soma dos valores em diagonal é: ", soma_diag)
			escreva("\n")

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 777; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */