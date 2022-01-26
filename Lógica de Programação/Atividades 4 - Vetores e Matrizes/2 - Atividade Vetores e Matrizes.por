/*



2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
A seguir determine e imprima a média aritmética dos lançamentos, 
contabilize e apresente também quantas foram as ocorrências da maior pontuação.



*/


programa
{
	

	
	funcao inicio()
	{

		inteiro v[10], x, maior = 0, soma = 0

		para(x = 0; x < 10; x++)
		{

			escreva("Digite um número: ")
			leia(v[x])


			se(v[x] == 6)
			{
				
				maior++

			}

			soma = soma + v[x]
			
		}

		para(x = 0; x < 10; x ++)
		{

			escreva(v[x], "\t")

		}


		escreva("\nO valor do médio dos lançamentos do dado foi ", soma/10)
		escreva("\nO maior valor aparece ", maior," vezes")

	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */